<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Educational Details</title>
</head>
<body>
	<div align="center">
		<h2>Step 3 of 3</h2>
		<hr>
		<h3>User Educational Details</h3>
		<form action="preview.jsp">
		
			<input type="hidden" name="name" value="<%=request.getParameter("name")%>">
			<input type="hidden" name="email" value="<%=request.getParameter("email")%>">
			<input type="hidden" name="contact" value="<%=request.getParameter("contact")%>">
			<input type="hidden" name="city" value="<%=request.getParameter("city")%>">
			<input type="hidden" name="pincode" value="<%=request.getParameter("pincode")%>">
			<input type="hidden" name="state" value="<%=request.getParameter("state")%>">
		
		
			Enter Title: <input type="text" name="title"><br> <br>
			Enter Passing Year: <input type="text" name="year"><br>
			<br> Enter Percentage: <input type="text" name="percent"><br>
			<br>
			<button type="submit">Preview</button>
		</form>
	</div>
</body>
</html>