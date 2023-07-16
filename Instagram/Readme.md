# INSTAGRAM PROJECT #

## Language ##
* Java

## Framework Used ##
* Spring Boot

## Dependencies ##
* The following dependencies are required to run the project:
* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Swagger

Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:

spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true




Data Model
The Job data model is defined in the Job class, which has the following attributes:

User Model
Id : integer
firstName : string
lastName : string
age : integer
email : string
password : string
phoneNumber : string
Post Model
postId = Long
createdDate : Timestamp
updatedDate : Timestamp
postData : String
@ManyToOne
user : User

Authentication Token
tokenId : Long
token : string
tokenCreationDate : LocalDate
@OneToOne 
user : User


API End Points
The following endpoints are available in the API:

User Controller:
POST /user/signup: create a new user account
POST /user/signin: authenticate a user and receive an authentication token
PUT /user: update user details
DELETE /user/signout: authenticate a user and delete authentication token
Post Controller
POST /post: create a new post
GET /post: get all posts

### DataBase Used ###
* SQL database

# Summary #
* This project is a basic web application that allows users to sign in, sign up, and manage their profile information. Additionally, users can create posts and view posts created by other users. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features of the application.