Account Manager Microservice

This is an Account Managing Microservice that  implements GET and POST 
on a user entity to provide basic CRUD operation to Create and Read
(One/All).

Tech Stack
  Java
  Maven
  Spring boot
  JPA
  H2
  
IDE: Eclipse EE 

Process
  A basic spring boot app is created using the STS tool suite.The 
  Spring web dependency,JPA and H2 is added.

  The data model is created using JPA that stores the objects in the h2 database
  in-memory.And JPA allows easy access of the objects via annotations alone.
  

  An object model is created using JPA notations.JPA automatically manages
  the database interactions and thus abstracts a lot of things.
  JPARepository interface is extended to an new Interface thus getting all the 
  CRUD functionality.Domain Type (USER) and id are specified.
  UserControllerClass is created that inmplements CommandLineRunner to
  start run method that loads the database once the application starts.
  A class is also created to handle ecxeption if a user is not found for a given id.
  Get AND Post Mapping annotations are used to map the requests to GET methods.
  Run the application and execute commands via curl command

  
  Run The Project

  For GET(all users): curl -v GET localhost:8080/users
               
  For GET(one): curl -v GET localhost:8080/users/{id}

  For POST: curl -v -H "Content-Type:application/json" localhost:8080/users
               -d "{\name\":\"sanidhya\",\"email\":\"abc@gmail.com\",\"accType\":\"Premium\"}"

 