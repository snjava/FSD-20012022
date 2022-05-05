<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<div align="left">
	<h2>Recent Login</h2>
	
	<%-- <%
		Cookie cks[] = request.getCookies(); // to get the cookies sent from client side
		String recentUser = "";
		if(cks != null) {
			for(Cookie c : cks) {
				if("user".equals(c.getName())) {
					recentUser = c.getValue();
				}
			}
		}
	%> --%>
	
	<%-- <h3><%= recentUser %></h3> --%>
	
	<h3>${cookie.user.value}</h3>
	
</div>

<div align="center">
	<h2>User Login</h2>
	
	<%
		String code = request.getParameter("c");
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