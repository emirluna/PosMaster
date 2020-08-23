<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu for Branches</title>
</head>
<body>
<div>
<h2>Active Branches</h2>

<c:choose>
	<c:when test="${branches.isEmpty()}">
	<h4 class="color-red">There isn´t a Branches created yet</h4>
	<br><a href="${pageContext.request.contextPath}/branches/branch-form">Create Branch</a>
	</c:when>
	<c:otherwise>
	<a href="${pageContext.request.contextPath}/branches/list">See List</a>
	</c:otherwise>
</c:choose>

</div>

<br><br>
<a href="${pageContext.request.contextPath}">
Go Back</a>
<br><br>


</body>
</html>