# Restaurant Management System #

## Language ##
### Java ###

## Framework Used ##
### Spring Boot ###

### Dependencies ###
* The following dependencies are required to run the project:

*  Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
*  MySQL Driver
* Lombok
* Validation
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
Id : Long
userName : string
email : string
password : string
role : Role
Role Model
Id : Long
roleType : String
roleDescription : String

Food Model
Id : Long
foodName : String
foodDescription : String
foodPrice : Double
foodImage : String

### Summary ###
* This project is a basic web application that allows users to sign in, sign up, and manage their food Orders . Additionally, admin can add new food and view orders created by other users. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features of the application.