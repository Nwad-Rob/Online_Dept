drop table if exists product;
drop table if exists useraccount;

CREATE TABLE product(
product_id int primary key auto_increment,
product_name varchar (255),
selling_price int,
available_quantity int,
category varchar (255) foreign key REFERENCES item(category)
);

CREATE TABLE item(
item_name varchar (255),
category varchar(255) primary key,
buying_price int 
);


Create TABLE useraccount(
email_id int primary key auto_increment,
username varchar (255),
user_password varchar(255) unique,
supercoins int
);

insert into product(product_name,selling price,available_quantity)values('Banana',0.5*buying_price,3,'Grocery');
insert into product(product_name,selling price,available_quantity)values('Television',0.5*buying_price,10,'Electronic');
insert into product(product_name,selling price,available_quantity)values('Books',0.5*buying_price,5,'Stationary');
insert into product(product_name,selling price,available_quantity)values('Peppers',0.5*buying_price,8,'Vegetable');
insert into product(product_name,selling price,available_quantity)values('Toilet Paper',0.5*buying_price,15,'Toiletry');
insert into product(product_name,selling price,available_quantity)values('Grapes',0.5*buying_price,6,'Grocery');
insert into product(product_name,selling price,available_quantity)values('Radio',0.5*buying_price,14,'Electronic');
insert into product(product_name,selling price,available_quantity)values('Pencils',0.5*buying_price,20, 'Stationary');
insert into product(product_name,selling price,available_quantity)values('Spinash',0.5*buying_price,12,'Vegetable');
insert into product(product_name,selling price,available_quantity)values('Hand Soap',0.5*buying_price,13,'Toiletry');

