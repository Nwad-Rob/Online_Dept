drop table if exists product;
drop table if exists useraccount;

CREATE TABLE product(
product_id int primary key auto_increment,
product_name varchar (255),
selling_price float,
available_quantity int
);

CREATE TABLE item(
item_id int primary key auto_increment,
product_id int,
item_name varchar (255) unique,
category varchar(255),
buying_price float, 
foreign key(product_id) REFERENCES product(product_id)
);

Create TABLE adminAccount(
    email_id int unique,
    username varchar (255),
    user_password varchar (255)
);


Create TABLE useraccount(
email_id int primary key auto_increment,
username varchar (255),
user_password varchar(255) unique,
supercoins int
);

insert into product(product_name,selling_price,available_quantity)values('Television',300.0,10);
insert into product(product_name,selling_price,available_quantity)values('Candy',4.50,50);
insert into product(product_name,selling_price,available_quantity)values('Tomatoes',5.70,20);
insert into product(product_name,selling_price,available_quantity)values('Books',37.50,27);
insert into product(product_name,selling_price,available_quantity)values('Toilet Paper',8.10,13);

insert into item(product_id,item_name,category,buying_price)values(3,'Cherry Tomato','Vegetable',3.80);
insert into item(product_id,item_name,category,buying_price)values(3,'Roma Tomato','Vegetable',3.80);
insert into item(product_id,item_name,category,buying_price)values(1,'Samsung', 'Electronic', 200.0);
insert into item(product_id,item_name,category,buying_price)values(1,'TCL','Electronic',200.0);
insert into item(product_id,item_name,category,buying_price)values(4,'Harry Potter','Stationary',25.0);
insert into item(product_id,item_name,category,buying_price)values(4,'Lords of the Ring','Stationary',25.0);
insert into item(product_id,item_name,category,buying_price)values(2,'KitKat', 'Grocery',3.0);
insert into item(product_id,item_name,category,buying_price)values(2,'Gummy Worms','Grocery', 3.0); 
insert into item(product_id,item_name,category,buying_price)values(5,'Dawn Papers','Toiletry', 5.40);
insert into item(product_id,item_name,category,buying_price)values(5,'Soft papers','Toiletry',5.40);


insert into useraccount(username,user_password,supercoins)values('testuser1','password1',100);
insert into useraccount(username,user_password,supercoins)values('testuser2','password2',100);
insert into useraccount(username,user_password,supercoins)values('testuser3','password3',100);
insert into adminAccount(email_id,username,user_password)values(1,'Princy','adminuser');

