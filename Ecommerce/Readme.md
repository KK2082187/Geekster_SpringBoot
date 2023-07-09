# Ecommerce  #

## Frameworks and language ##
Framework : SpringBoot
Language : java 

## Data flow ##

### Controller ###
*AddressController

-saveAddress()
-To save the address of user.

*OrderController

-saveOrder()
-To save the order of the user.

-getOrderById()
-To get the order by Id.

*ProductController

-saveProduct()
-To save the product of user in the table.

-getProductByCategory()
-To get the product by category.

-getAllProduct()
-To get all the product in table.

-deleteById()
-To delete the product by id.

-UserController

-saveUser()
-To save the user.

-getUserById()
-To get the user by id.

### Service ###
-getOrderByOrderId( )
-To get all the order by orderId.

-getUserByUserId( ) 
-To get all the user by userId.

-getProducts( ) 
-To get all the product list.

-deleteProduct( )
-To delete the product from the table.

### Repository ###
SQL code is written in the repository layer.
Data Structure used in project
H2 Database

##  Summary ##
Ecommerce application is REST API Application In this project I have created 4 models namely User, Product, Address and Order. I have provided some endpoints .

