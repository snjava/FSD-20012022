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
		String color ="";
		String msg = "";
		if(code!=null) {
			switch(code){
				case "401":
					msg = "Invalid User Name or Password";
					color = "red";
				break;
				
				case "408":
					msg = "Your session has been expire. Please login again...";
					color = "red";
				break;
				
				case "201":
					msg = "You have been logged out successfully...";
					color = "green";
				break;
			}
		}
	%>
	
	<h3 style="color: <%=color%>"><%=msg%></h3>
	
	<form action="validate" method="post">
		Enter User Name : <input type="text" name="uname"><br/><br/>
		Enter Password : <input type="password" name="upass"><br/><br/>
		<input type="submit" value="Login"><br/><br/>
	</form>
</div>


</body>
</html>