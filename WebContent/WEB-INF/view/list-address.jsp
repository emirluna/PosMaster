<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POS - Point Of Sales</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/style.css" >

</head>
<body>
<div id="wrapper">
		<div id="header">

			<h2>List of Address</h2>

		</div>
	</div>

<div id="container">
		<div id="content">

			<input type="button" value="Add Address"
			onclick="window.location.href='../showFormAdd/${enterpriseId}'; return false;"
			class="add-button" />
<!-- ${tempBranches.enterprise.id} -->

	<table>
		<tr>
			<td>ID</td>
			<td>Country</td>
			<td>State</td>
			<td>City</td>
			<td>Street</td>
			<td>Number</td>
		</tr>
	
	
	

		<c:forEach var="tempAddress" items="${address}">
			<tr>
				<td>${tempAddress.id}</td>
				<td>${tempAddress.country}</td>
				<td>${tempAddress.state}</td>
				<td>${tempAddress.city}</td>
				<td>${tempAddress.street}</td>
				<td>${tempAddress.number}</td>
				</tr>
		</c:forEach>
	
	</table>
	</div>
</div>



</body>
</html>