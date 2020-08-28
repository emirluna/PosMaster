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

			<input type="button" value="Go Back"
			onclick="window.location.href='../'; return false;"
			class="btn btn-warning" />

			<input type="button" value="Add Customer"
			onclick="window.location.href='customer-form'; return false;"
			class="btn btn-primary" />
<br><br>
<c:choose>
<c:when test="${customers.isEmpty()}">

<a href="customer-form">Create Customers</a>


</c:when>
<c:otherwise>
<a href="customer-list">See Customers List</a>

<h2>The most Active Customers</h2>
	
<h2>The less Active Customers</h2>

</c:otherwise>
</c:choose>


	
	
	
	</div>
	
	
</div>


</body>
</html>