# Instagram #

## Language ##
* Java

## Framework ##
* Springboot

## Dependencies Used ##
* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation

### Data flow ###
* The user at client side sends a request to the application through the API endpoints.
* The API receives the request and sends it to the appropriate controller method.
* The controller method makes a call to the method in service class.
* The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
* The controller method returns a response to the API.
The API sends the response back to the user.

## Database Used ##
* Sql

## Summary ##
* The project is a basic web application built using Java and the Spring framework. It allows users to sign up, sign in, and manage their profile information. Users can also create and view posts. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features. The API endpoints include user signup, signin, and update details, post creation and retrieval, and authentication token creation.
