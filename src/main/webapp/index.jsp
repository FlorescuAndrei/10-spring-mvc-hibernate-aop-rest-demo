

<html>
<body>

<h3>Spring CRM REST Demo</h3>
<a href="${pageContext.request.contextPath}/customer/list">Access view page for CRM app</a>
<hr>
<a href="${pageContext.request.contextPath}/api/customers">Access REST Service for CRM app</a>
	<br><br>
	<div> For REST Service you will need Postman as a REST client 
	<ul>
		<li>/api/customers 			- GET method - view all customers;</li>
		<li>/api/customers/{number} - GET method - single customer view;</li>
		<li>/api/customers 			- POST method - add/create a customer;</li>
		<li>/api/customers/{number} - PUT method - update a customer;</li>
		<li>/api/customers/{number} - DELETE method - delete a customer;</li>
	</ul>
			
			
			
			
			
			
			
	</div>

</body>
</html>
