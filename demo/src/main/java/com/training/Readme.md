Online Departmental Store Opening:
Problem Statement:
Princy is a young girl with the passion to open her own department store. She has bought all the products required to the store. She has to go digital and store all her products in her website. Categorizing the product are done. Now help her go ahead for the next step, by creating the user accessing her products.
Note: Use project 1 as boiler plate code.
#Check List:
As an store owner, Princy needs to login in her website using username and password
Validate the credentials and allow to access the options.
Every item is a product. Use ((buyingprice*0.5)+buyingprice)to calculate the sellingPrice.
Options are (for admin) 
List the products in the store (productid, product Name, category, Quantity, price )
Search the product by using productid
List the products by category (Grocery, Stationary, Toiletry, Vegetables)
Search the product by using the name and view the details of the product.
To check the total amount, spend on her products.
Display the Profit amount that she gets on category wise. 
Options for Customer
Existing customer can login and view the products from the store.
Allow new customer to register and login to view the products  
Provide 100 super coins for the new user as a welcome bonus.
Provide filter options based on category and price for the customer
If customer use filter for price, display products with price low to high
If customer use filter for category, allow user to select the category and display the product from the specific category.
#Instructions:
Product Should be class with attributes
productid
productName
sellingPrice
availableQuantity
Create a class for User with attributes
username
emailId
password
superCoins
Create a class for Item with attributes
Itemname
Category
buyingPrice
Create product, user, item as a pojo.
Convert all the arrays into list for storing user details.
Use Map to store the product details.
Create StoreInformation class to define all the functionalities related methods. 
Create custom exception for handling the improper inputs
Display menu options until user wants to exit from the application.
Create a separate thread for different users.
Use java 8 features in the applicaton.
Note: Registration should be allowed for customers only, admin registration should be restricted.