<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<div align="center">
	<h2>User Login</h2>
	
	<%
		String code = request.getParameter("code");
		if(code!=null && code.equals("401")) {
	%>
		<h3 style="color: red">Invalid User Name or Password</h3>
	<%		
		}
	%>
	
	<form action="validate" method="post">
		Enter User Name : <input type="text" name="uname"><br/><br/>
		Enter Password : <input type="password" name="upass"><br/><br/>
		<input type="submit" value="Login"><br/><br/>
	</form>
</div>


</body>
</html>