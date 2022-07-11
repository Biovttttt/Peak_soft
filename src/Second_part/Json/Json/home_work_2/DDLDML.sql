Create table Students(
                         id  integer ,
                         name varchar,
                         surname varchar,
                         date_brith date,
                         tel_number numeric
);
insert into Students
values (1,'TIlek','Birimkulov',to_date('03-01-1998','dd-mm-yyyy'),0505269897),

       (2,'Ruslan','Kanybekov',to_date('03-02-1996','dd-mm-yyyy'),0505269897);
Create table Customers(
                          id  integer   ,
                         name varchar,
                         surname varchar,
                         Doljnost varchar,
                         tel_number numeric
);
insert into Customers
values (1,'TIlek','Birimkulov','Programmer',0505269897),


       (2,'Ruslan','Kanybekov','junior Programmer',0505269897);
Create table Doctors(
                          id  integer   ,
                          name varchar,
                          staj double precision,
                          type varchar,
                          tel_number numeric
);
insert into Doctors
values (1,'TIlek',1.5,'Хирург',0505269897),
       (2,'Ruslan',2.5,'Терепевт',0505269897);
Create table Buhgalteriya(
                          id  integer   ,
                          name varchar,
                          staj double precision,
                       tel_number numeric
);
insert into Buhgalteriya
values (1,'TIlek',1.5,0505269897),
       (2,'Ruslan',2.5,0505269897);
Create table Garaj(
                          id  integer   ,
                          id_parka varchar,
                          number_mashin varchar,
                       tel_number numeric
);
insert into Garaj
values (1,'park-1','01KG009',0503269897),
       (2,'park-2','01KG009',0506269897);
Create table Voditel(
                          id  integer   ,
                          name varchar,
                          staj double precision,
                       Mashina varchar
);
insert into Voditel
values (1,'TIlek',1.5,'Toyota'),
       (2,'Ruslan',2.5,'Honda');
Create table Truck(
                          id  integer   ,
                          name varchar,
                          mashina varchar,
                          voditel varchar,
                       adres_otpravki varchar
);
insert into Truck
values (1,'Truck-almedin','Toyota','Tilek'),
       (2,'Truck-Osh','Honda','Ruslan');
Create table Remont(
                          id  integer   ,
                          mashina varchar,
                          prichina varchar

);
insert into Remont
values (1,'Toyota','Dvigatel'),
       (2,'Ruslan','Koleso');

Create table AAAA(
                          id_A  integer   ,
                          name_A varchar,
                          staj_A double precision,
                       tel_number_VB numeric
);
insert into AAAA
values (1,'TIlek',1.5,0505269897),
       (2,'Ruslan',2.5,0505269897);
Create table BBBBB(
                          id_bb  integer   ,
                          name_BB varchar,
                          staj_BB double precision,
                       tel_number_bb numeric
);
insert into BBBBB
values (1,'TIlek',1.5,0505269897),
       (2,'Ruslan',2.5,0505269897);

delete from Remont;
update Remont set mashina='Mercedes' where id=1;