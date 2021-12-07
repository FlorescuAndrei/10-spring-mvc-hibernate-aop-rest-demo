# 10-spring-mvc-hibernate-aop-rest-demo
Spring REST Learning project.  
View customer, Add customer, Update customer, Delete customer via Spring MVC jsp pages or via Spring REST endpoint using Postman as client.

About the project:  
Maven project with java config.    

CRM  project:  
  - MySQL database with clients  
  -  Hibernate – as JPA implementation  
  -  Spring MVC  
  -  Spring AOP  
  -  Spring REST


Learning notes:	  

Postman is a RESTClient, like a browser client design for advance REST testing.  
Postman seetings to send JSON data - body*row*applicationJson  
  
    
| HTTP Method | CRUD   | Action	Edpoint |
| :---------- |:------:| :--------------|
| POST        | CREATE | /api/customers |
| GET         | READ   | <ul><li>/api/customers</li><li> /api/customers/{customerId}</li>|
| PUT         | UPDATE | /api/customers |  
| DELETE      | DELETE | /api/customers/{customerId} |


To do:  
  - create a REST client for CRM app;  
  - secure REST API endpoints.  

[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)

