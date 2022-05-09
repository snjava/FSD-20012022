<%@page import="com.phbook.dto.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Contact</title>
</head>
<body>

<%@ include file="menu.jsp" %>

	<div align="center">
		<h1>View All Contacts</h1>
		
		<table border="2">
			<thead>
				<tr>
					<th>Name</th>
					<th>Contact</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
		<%-- ${ requestScope.contactList } --%>
		<%
			List<Contact> list = (List<Contact>) request.getAttribute("contactList");
			for(Contact ct : list) {
		%>
			<tr>
				<td> <%= ct.getFname() %> <%= ct.getLname() %></td>
				<td><%= ct.getContact() %></td>
				<td>
					<a href="#?id=<%=ct.getId()%>">Edit</a> / 
					<a href="#?id=<%=ct.getId()%>">Delete</a>
				</td>		
			</tr>
		<%
				
			}
		
		%>
		
		
			</tbody>
		</table>
		
	</div>

</body>
</html>