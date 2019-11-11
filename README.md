Project Name : Employee Application
Description : Here I have written backend code for processing of employee information using spring boot and REST.

Features:

1. I have used springboot2 and REST for its development.
2. I have not written frontend code for entering data. Currently I am feeding some data initially and later on I am updating data using POST at runtime.
3. I have written code for testing springboot application also.


Testing of Application:

1. Git checkout project from github.
   URL:
   
2. Import projects and perform below command to install required dependencies.
   Maven install
   
3. Go to main class of application i.e EmployeeApplication.java and run as java application.

4. Server will start at port 8080. Now hit the below URL in browser:
	http://localhost:8080/employees/
	
	This will give list of pre defined employees data in json form.
	
5. For adding employee data at runtime follow below steps:
	1. Open postman in your system.
	2. Give following values in postman.
	   
	   URL: http://localhost:8080/employees/
	   Method Type : POST
	   
	   In headers section:
	   Content-Type : application/json
	   X-COM-PERSIST : true
	   
	   In body section:
	   Select raw radio button and application/json in type beside radio button.
	   
	   Pass any json data in required format to add to list.
	   Ex: {"id":6,"firstName":"Raju","lastName":"Tyagi","gender":"Male","dob":"03/12/1989","department":"Sports"}
	   
	 3. Pass the request by clicking send button.
	 
6. Now again go to URL :http://localhost:8080/employee, refresh it you will get new data added there.


