<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Customers</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >

</head>
<body>

	<div id="wrapper">
		<div id="header">

			<h2>Customers</h2>

		</div>
	</div>


	<div id="container">
		<div id="content">

			<table class="table">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Last Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Details</td>
			<th>Buys</td>
			<th>Account</td>
			<th colspan=2>Actions</th>
		</tr>
	
		<c:forEach var="tempCustomers" items="${customers}">
			<tr>
				<td>${tempCustomers.id}</td>
				<td>${tempCustomers.name}</td>
				<td>${tempCustomers.lastName}</td>
				<td>${tempCustomers.phone}</td>
				<td>${tempCustomers.email}</td>
				
				<c:url var="DetailLink" value="customer-details">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>
					<td><a href="${DetailLink}">Details</a></td>
				
				<c:url var="BuyListLink" value="customer-buy">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>
					<td><a href="${BuyListLink}">Buys</a></td>
				
				<c:url var="AccountLink" value="customer-account">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>
					<td><a href="${AccountLink}">Account</a></td>
				
				
				<c:url var="EditLink" value="customer-edit-form">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>
					<td><a href="${EditLink}">Edit</a></td>
					
				<c:url var="DeleteLink" value="customer-delete">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>	
					<td><a href="${DeleteLink}">Delete</a></td>
				
				
				</tr>
				
		</c:forEach>


	</table>
	<br><br>

		</div>
	</div>

</body>
</html>