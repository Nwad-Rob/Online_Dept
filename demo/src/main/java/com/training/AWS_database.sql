drop table if exists product;
drop table if exists useraccount;

CREATE TABLE product(
product_id int primary key auto_increment,
product_name varchar (255),
selling_price int,
available_quantity int,
);

CREATE TABLE item(
item_id int primary key auto_increment,
product_id int,
item_name varchar (255) unique,
category varchar(255),
buying_price int 
item_id int  foreign key REFERENCES product(product_id)
);


Create TABLE useraccount(
email_id int primary key auto_increment,
username varchar (255),
user_password varchar(255) unique,
supercoins int
);

insert into product(product_name,selling_price,available_quantity)values('Tomato',0.5*buying_price,3);
insert into product(product_name,selling_price,available_quantity)values('Television',0.5*buying_price,10);
insert into product(product_name,selling_price,available_quantity)values('Books',0.5*buying_price,5);
insert into product(product_name,selling_price,available_quantity)values('Peppers',0.5*buying_price,8);
insert into product(product_name,selling_price,available_quantity)values('Toilet Paper',0.5*buying_price,15);
insert into product(product_name,selling_price,available_quantity)values('Tomato',0.5*buying_price,6);
insert into product(product_name,selling_price,available_quantity)values('Television',0.5*buying_price,14);
insert into product(product_name,selling_price,available_quantity)values('Books',0.5*buying_price,20);
insert into product(product_name,selling_price,available_quantity)values('Peppers',0.5*buying_price,12);
insert into product(product_name,selling_price,available_quantity)values('Toilet Paper',0.5*buying_price,13);

insert into item(product_id,item_name,category,buying_price)values(1,'Cherry Tomato','Vegetable',3);
insert into item(product_id,item_name,category,buying_price)values(1,'Roma Tomato','Vegetable',5);
insert into item(product_id,item_name,category,buying_price)values(2,'Samsung', 'Electronic', 200);
insert into item(product_id,item_name,category,buying_price)values(2,'TCL','Electronic',250);
insert into item(product_id,item_name,category,buying_price)values(3,'Harry Potter','Stationary',25);
insert into item(product_id,item_name,category,buying_price)values(3,'Lords of the Ring',20);
insert into item(product_id,item_name,category,buying_price)values(4,'Bell Peppers', 6);
insert into item(product_id,item_name,category,buying_price)values(4,'jalepeno Peppers', 3); 
insert into item(product_id,item_name,category,buying_price)values(5,'Dawn Papers', 7);
insert into item(product_id,item_name,category,buying_price)values(5,'Soft papers',5);

insert into useraccount(username,user_password,supercoins)values('testuser','password',100);

