<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Calculator</title>
</head>
<body>

<div align="center">

	<form action="calculate.jsp">
		Enter 1st number <input type="text" name="num1"><br><br>
		Enter 2nd number <input type="text" name="num2"><br><br>
		Select Operation <select name="operation">
							<option value="+"> + </option>
							<option value="-"> - </option>
							<option value="*"> * </option>
							<option value="/"> / </option>
						</select><br><br>
		<input type="submit" value="Get The Answer">
	</form>


</div>


</body>
</html>