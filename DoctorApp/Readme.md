# Doctor App #

## Frameworks Language ##
* Framework : SpringBoot
* Language : java 

## Data Flow ##
### Controller ###
* The controller package has two classes, first - DoctorController and second PatientController
* DoctorController :- User can do CURD operation in DoctorController
* PatientController :- When User is login then he can do CURD operation from the PatientController

### Service ###
* The service package has two classes, first DoctorService and second PatientService
* DoctorService :- The logic of all the card operations of the Doctor controller is written here.
* PatientService :- The logic of all the card operations of the Patient controller is written here.

### Dao ###
* There are two interfaces in the dao layer which extend the JPARepository and inside it, we fetch the data from the database by sending all the sql commands.

## Summary ##
* In this project we can add new doctor and assign patient according to doctor.Which doctor has been assigned to which patient, when has the patient arrived. We can see all these details.