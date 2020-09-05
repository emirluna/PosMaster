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
			<th colspan=2>Actions</th>
		</tr>
	
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.lastName}</td>
				<td>${customer.phone}</td>
				<td>${customer.email}</td>
			
				
				<c:url var="EditLink" value="customer-edit-form">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>
					<td><a href="${EditLink}">Edit</a></td>
					
				<c:url var="DeleteLink" value="customer-delete">
					<c:param name="id" value="${tempCustomers.id}" />
				</c:url>	
					<td><a href="${DeleteLink}">Delete</a></td>
				
				</tr>
				
				<tr>
					<th>Birth Day</th>
					<th>Registration Date</th>
					<th>Last Operation</th>
					<th>Last Buy</th>
					
				</tr>
				
				<tr>
					<td>${customer.customer_Detail.birthDate}</td>
					<td>${customer.customer_Detail.registrationDate}</td>
					<td>${customer.customer_Detail.lastOperation}</td>
					<td>${customer.customer_Detail.lastBuy}</td>
				</tr>
				
				
				<tr>
					<th>Id Account</th>
					<th>Balance</th>
					<th>Payment Code</th>
					<th>Min</th>
					<th>Max</th>
					<th colspan=2>Actions</th>
				</tr>
				
				<tr>
					<td>${customer.account_.balance}</td>
					<td>${customer.account_.paymentCode}</td>
					<td>${customer.account_.min}</td>
					<td>${customer.account_.max}</td>
				</tr>
				
				
	</table>
	<br><br>

		</div>
	</div>

</body>
</html>