# 10-spring-mvc-hibernate-aop-rest-demo
Spring REST Learning project.  
View customer, Add customer, Update customer, Delete customer via Spring MVC jsp pages or via Spring REST endpoint using Postman as client.

About the project:  
Maven project with java config.    

•	CRM  project : 
  o	MySQL database with clients
  o	Hibernate – as JPA implementation
  o	Spring MVC
  o	Spring AOP
  o	Spring REST


Learning notes:	  

Postman is a RESTClient, like a browser client design for advance REST testing.  
Postman seetings to send JSON data - body/row/applicationJson

HTTP Method	CRUD Action	Edpoint
Post	CREATE	/api/customers
Get	READ	/api/customers
/api/customers/{customerId} – one customer
Put	UPDATE	/api/customers
Delete	DELETE	/api/customers/{customerId}


To do: 	
•	create a REST client for CRM app
•	secure REST API endpoints

