--1) Вывести всех клиентов из страны Canada
select *from customer where country='Canada';
--2) Вывести все страны клиентов
select country from customer;
--3) Вывести количество всех заказов
select count(order_number)from orders;
--4) Вывести максимальную стоимость заказа
select max(total_amount)from orders;
--5) Найти сумму всех заказов
select sum(total_amount)from orders;
--6) Найти сумму всех заказов за 2014 год
select sum(total_amount)from orders where order_date = to_date('2014','yyyy');
--7) Найти среднюю стоимость всех заказов
select round(avg(orders.total_amount),2) from orders;
--8) Найти среднюю стоимость всех заказов по каждому клиенту
select  customer_id , avg(total_amount) as "average" from orders
group by customer_id,total_amount;
--9) Найти всех клиентов, которые живут в Бразилии или Испании
select *from customer where country in ('Brazil','Spain');
--10 Найти все заказы между 2013ым и 2014ым годами, которые стоили меньше 100.00$
select *from orders where order_date > to_date('2013','yyyy') and order_date <= to_date('2014','yyyy') and total_amount<100
--11) Найти всех клиентов, которые в одной из стран: Испания, Италия, Германия, Франция. Отсортируйте по странам
select *from customer where country in ('Germany','Spain','France','Italy') order by country asc;
--12) Найти все страны клиентов, страны которых содержаться в таблице поставщиков
select distinct customer.country from  customer join supplier on customer.country=supplier.country;
--13) Найти всех клиентов, имена которых начинаются на ‘Jo’
select *from customer where first_name like ('%Jo%');
--14) Найти всех клиентов, имена которых заканчиваются на ‘a’ и имеют длину ровно 4 символа
select *from customer where first_name like ('%a') and length(first_name)=4;
--15) Найти количество клиентов по странам
select customer.country,count(id) from customer
group by customer.country;
--16) Найти количество клиентов по странам. Вывести в порядке убывания
select customer.country,count(id) from customer
group by customer.country
order by count(id) desc;
--17) Найти общую сумму стоимости заказов и количество заказов по каждому клиенту (customer_id). Отсортировать по сумме
select sum(orders.total_amount),count(orders.customer_id),customer_id from orders
group by customer_id
order by sum(orders.total_amount) asc;
--18) Найти общую сумму стоимости заказов и количество заказов по каждому клиенту (customer_id),
-- у которых общее количество заказов больше 20ти
select *from  ( select sum(orders.total_amount),count(orders.customer_id) as total_count,customer_id from orders
group by customer_id
order by sum(orders.total_amount) asc ) orders where total_count>20