<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu for Configurations</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >

</head>
<body>


<div class="container">
<div>
<h2>Current Configuration</h2>

<c:if test="${configurations == null}">
	<h4 class="color-red">There isn´t a configuration created yet</h4>
	<a href="${pageContext.request.contextPath}/configuration/form">Create Configuration</a>
</c:if>

<table class="table">
<tr>
<th>Id</th>
<th>Company Name</th>
<th>Description</th>
<th>Owner</th>
<th>Email</th>
<th>Phone</th>
</tr>
<c:forEach var="tempConfigs" items="${configurations}">
		<tr>
			<td>${tempConfigs.id}</td>
			<td>${tempConfigs.company_name}</td>
			<td>${tempConfigs.description}</td>
			<td>${tempConfigs.owner_name}</td>
			<td>${tempConfigs.main_email}</td>
			<td>${tempConfigs.main_phone}</td>
			<td><a href="${pageContext.request.contextPath}/configuration/edit/${tempConfigs.id}">Edit</a></td>
			<td><a href="${pageContext.request.contextPath}/configuration/delete/${tempConfigs.id}">Delete</a></td>
		</tr>
</c:forEach>
</table>
</div>
</div>

<br><br>
<a href="${pageContext.request.contextPath}">
Go Back</a>
<br><br>



</body>
</html>