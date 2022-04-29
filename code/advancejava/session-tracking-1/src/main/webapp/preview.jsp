<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview Details</title>
</head>
<body>
<div align="center">
		<h2>Preview Details</h2>
		
		<h2>User Personal Details</h2>
		<h4>Name : <%= request.getParameter("name") %> </h4>
		<h4>Email : <%= request.getParameter("email") %></h4>
		<h4>Contact : <%= request.getParameter("contact") %></h4>
		
		
		<h2>User Address Details</h2>
		<h4>City : <%= request.getParameter("city") %></h4>
		<h4>Pincode : <%= request.getParameter("pincode") %></h4>
		<h4>State : <%= request.getParameter("state") %></h4>
		
		
		<h2>User Educational Details</h2>
		<h4>Title : <%= request.getParameter("title") %> </h4>
		<h4>Passing Year : <%= request.getParameter("year") %></h4>
		<h4>Percentage : <%= request.getParameter("percent") %></h4>
		
		<h2><a href="create-user?name=<%= request.getParameter("name")%>&email=<%= request.getParameter("email") %>&contact=<%= request.getParameter("contact") %>&
		city=<%= request.getParameter("city") %>&pincode=<%= request.getParameter("pincode") %>&state=<%= request.getParameter("state") %>&
		title=<%= request.getParameter("title") %>&year=<%= request.getParameter("year")%>&percent=<%= request.getParameter("percent") %>">Save Details</a></h2>
		
</div>
</body>
</html>













