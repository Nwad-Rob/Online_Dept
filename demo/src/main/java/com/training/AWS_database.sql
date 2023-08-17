drop table if exists product;
drop table if exists useraccount;

CREATE TABLE Product(
product_id int primary key auto_increment,
product_name varchar (255),
selling_price int,
available_quantity int
);

CREATE TABLE item(
item_name varchar (255),
category varchar(255),
buying_price int 
);


Create TABLE useraccount(
email_id int primary key auto_increment,
username varchar (255),
user_password varchar(255) unique,
supercoins int
);