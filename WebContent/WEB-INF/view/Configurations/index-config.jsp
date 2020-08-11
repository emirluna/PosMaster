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
			<td>${tempConfigs.companyName}</td>
			<td>${tempConfigs.description}</td>
			<td>${tempConfigs.ownerName}</td>
			<td>${tempConfigs.mainEmail}</td>
			<td>${tempConfigs.mainPhone}</td>
			<c:url var="updateLink" value="/configuration/edit">
			<c:param name="id" value="${tempConfigs.id}" />
			</c:url>
			<td><a href="${updateLink}">Edit</a></td>
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