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
		Total Categories
		<c:forEach var="tempCategories" items="${categories}">
			${tempCategories.id}
		</c:forEach>	
	</div>
</div>


<div>
<div>
<h2>List of Categories</h2>
<ol>
	<li>Category One</li>
	<li>Category Two</li>
	<li>Category Three</li>
</ol>
<a href="${pageContext.request.contextPath}/newCategories/">
New Categories</a>
<br><br>

</div>

<br><br>
<br><br>
<div class="conatiner">
<div>
<ol>
	<li>Product One</li>
	<li>Product Two</li>
	<li>Product Three</li>
</ol>
<a href="${pageContext.request.contextPath}/newProduct/">
New Product</a>
<br><br>
</div>

</div>

</div>
<br><br>



<a href="${pageContext.request.contextPath}">
Go Back</a>
<br><br>


</body>
</html>