<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of categories</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >
</head>
<body>
<h2>Category List</h2>
<br>
	<a href="${pageContext.request.contextPath}/products/category-form">Create Category</a>
<br><br>
<table class="table">
<tr>
<th>Id</th>
<th>Category name</th>

</tr>
<c:forEach var="tempCategories" items="${categories}">
		<tr>
			<td>${tempCategories.id}</td>
			<td>${tempCategories.name}</td>
			<c:url var="updateLink" value="/products/edit-category">
			<c:param name="id" value="${tempCategories.id}" />
			</c:url>
			<td><a href="${updateLink}">Edit</a></td>
			 
			<c:if test="${tempCategories.products.isEmpty()}">
			success
			</c:if>	
					
			<c:choose>
				<c:when test="${tempCategories.products.isEmpty()}">
					<td><a href="${pageContext.request.contextPath}/products/delete-category/${tempCategories.id}" 
					onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" >Delete</a></td>
				</c:when>
				<c:otherwise>
					<td><a onclick="if (!(confirm('This category can´t be deleted now'))) return false">Delete</a></td>			
				</c:otherwise>
			</c:choose>
		
		</tr>
</c:forEach>
</table>

<br><br>
<a href="${pageContext.request.contextPath}/products/">
Go Back</a>

</body>
</html>