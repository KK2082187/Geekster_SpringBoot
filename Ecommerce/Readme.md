# Ecommerce  #

## Frameworks and language ##
Framework : SpringBoot
Language : java 

## Data flow ##

### Controller ###
*AddressController

-saveAddress()

*OrderController

-saveOrder()

-getOrderById()

*ProductController

-saveProduct()

-getProductByCategory()

-getAllProduct()

-deleteById()

-UserController

-saveUser()

-getUserById()

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

