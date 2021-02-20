
#LoginRegistrationEmail

## Description
My Personal Side Project of Learning User Registration and Verification Process using Spring


##Dependencies Used
Lombok, Spring Web, Spring Security, PostgreSQL Driver, Spring Data JPA


##Securing the Endpoints
WebSecurityConfig.java
RegistrationController.java
RegistrationService.java
POSTMAN

##Registration Service
RegistrationRequest.java
RegistrationService.java
AppUserService.java
POSTMAN - Send PostMapping request to the server
PostgreSQL - registration1 data server - app_user table


##Email Confirmation
AppUserService.java - signUpUser method
ConfirmationToken.java
ConfirmationTokenService.java
ConfirmationTokenRepository.java
POSTMAN  PostMapping returns the token when creating/registering/saving user from AppUserService.java
PostgreSQL - confirmation_token table from registration1 database server










