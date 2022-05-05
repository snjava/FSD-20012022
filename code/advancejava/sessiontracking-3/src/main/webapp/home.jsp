<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	if(session.getAttribute("user") == null) {
		response.sendRedirect("login.jsp?code=408");
	}
%>
<div align="right">
	<h3><a href="logout">Logout</a></h3>
</div>
<hr>
<div align="center">
	<%-- <%
		HttpSession s = request.getSession(); // to get the session (you can use implicit object here instead of creating it)
	%> --%>
	<h1>Welcome User, <%= session.getAttribute("user") %></h1>
</div>
</body>
</html>