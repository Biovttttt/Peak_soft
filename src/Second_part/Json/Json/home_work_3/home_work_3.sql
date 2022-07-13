CREATE TABLE products (
                          id SERIAL PRIMARY KEY,
                          productName VARCHAR(30) NOT NULL,
                          manufacturer VARCHAR(20) NOT NULL,
                          productCount INTEGER DEFAULT 0,
                          price NUMERIC
);
INSERT INTO products (productName, manufacturer, productCount, price,discount)
VALUES ('iPhone X', 'Apple', 2, 88000,'yes'),
       ('iPhone 8', 'Apple', 3, 56000,''),
       ('Galaxy S9', 'Samsung', 6, 56000,''),
       ('Galaxy S8 Plus', 'Samsung', 2, 46000,'yes'),
       ('Desire 12', 'HTC', 3, 26000,'');


--1. HTC компаниясынан башка компаниянын продуктуларын алыныз
select *from products where manufacturer != 'HTC';
--2  Apple компаниясынын 75000минден томонку баадагы продуктуларын алыныз.
select *from products where manufacturer = 'Apple' and  price >=75000;
--3  Баасы 46000 жана андан ойдоку продуктулардын баарын алыныз
select *from products where    price >=46000;
--4  Эн кымбат эки продукту алыныз
select *from products order by price desc limit  2;
--5  Баасы минимальный болгон продуктун атын алыныз
select productName from products order by price asc limit  1;
--6  Дискоунт болгон продуктуларды чыгарыныз.
select * from products where discount ='yes';
--7. Дискоунт болбогон продуктуларды чыгарыныз.
select * from products where discount is null;
--8. Баардык продуктулардын баасын кымбаттан арзанга карап чыгарыныз
select *from products order by price desc;
--9  Баардык продуктулардын суммасын(баасын) чыгарыныз.
select sum(price)from  products t;
--10. Эки жана андан аз продуктусу бар компанияларды алыныз
select *from products where productCount <=2;


