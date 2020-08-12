<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu for Products</title>
<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >
</head>
<body>
<div class="container">
	<div class="row">
<h2>Categories</h2>
<c:choose>
	<c:when test="${categories == null}">
	<h4 class="color-red">There isn´t a Categories created yet</h4>
	<a href="${pageContext.request.contextPath}/category-form">Create Category</a>
	</c:when>
	<c:otherwise>
	<a href="${pageContext.request.contextPath}/categories">See Category</a>
	</c:otherwise>
</c:choose>


		
	</div>
</div>


<div>
<div>




</div>

<br><br>
<br><br>
<div class="conatiner">
	<div class="row">
	<h2>Categories</h2>
	<c:choose>
		<c:when test="${prdoucts == null}">
		<h4 class="color-red">There isn´t a Products created yet</h4>
		<a href="${pageContext.request.contextPath}/product-form">Create Product</a>
		</c:when>
		<c:otherwise>
		<a href="${pageContext.request.contextPath}/products">See Products</a>
		</c:otherwise>
	</c:choose>
	
		

		
	</div>

<br><br>
</div>

</div>

<br><br>



<a href="${pageContext.request.contextPath}">
Go Back</a>
<br><br>


</body>
</html>