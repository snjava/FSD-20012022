<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression Language</title>
</head>
<body>
	
	100/10 : <%= 100 / 10 %>
	
	<br>
	
	100/10 : ${ 100 / 10 }
	
	<hr>
	
	User Name : <%= session.getAttribute("user") %>
	<br>
	User Name : ${ sessionScope.user }

</body>
</html>