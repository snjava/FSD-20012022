<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
	<head>
		<meta charset="ISO-8859-1">
		<title>First Jsp Page</title>
		
		<script type="text/javascript">  /* Java Script */
			//alert("This is from Java Script");
			function showDiv() {
				document.getElementById("user-info").style.display = "block";
			}
		</script>
		
		<style type="text/css"> /* CSS */
			h2 {
				color: red;
				background-color: yellow;
			}
		</style>
		
	</head>
	<body>
		<a id="form-show-hide" href="#" onclick="showDiv()">Show Form</a>
		<h1>THis is the tag to show the changes in Servlet code</h1>
		<div id="user-info" align="center" style="display: none;">
			<h2>User Details</h2>
			<form action="display-details">
				Enter Name  : <input type="text" name="name" required="required"><br/><br/>
				Enter Email : <input type="email" name="email" required="required"><br/><br/>
				<button type="submit">Submit</button>
			</form>
		</div>
	</body>
</html>