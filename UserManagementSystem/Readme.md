#  User Management System  #
##  Language used ##
Java 
### Framework used ###
SpringBoot

## Data flow ##
###  Controller  ###
 Controller methods are the final destination point that a web request can reach.
- @PostMapping("/addUser")
- @GetMapping("/getUser/{userId}")
- @PutMapping("/updateUserInfo/{userId}")
- @DeleteMapping("/deleteUser/{userId}")
### Model ###
 The model represents a Java object carrying data. 
- I used Constructor ,getter and setter in model.
###  Service  ###
Service annotation and allows developers to add business functionalities
## Summary ##
 This project is based on user management system to handle activities related to individuals' access to devices, software, and services.
In this I used different dependencies like spring web and spring web tool.And you can add ,update and remove data .