<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Product</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >

</head>
<body>

<div>
<div class="container">
		<h3>Save Product</h3>
	 	<form:form action="saveProduct" modelAttribute="product"
			method="POST">
			<!-- need to associate this data with customer id -->
			<form:hidden path="Id"/>
			<table>
				<tr>
					<td><label>Product Name: </label></td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td><label>Short Name: </label></td>
					<td><form:input path="shortName" /></td>
				</tr>
				<tr>
					<td><label>Measure: </label></td>
					<td><form:input path="measure" /></td>
				</tr>
				<tr>
					<td><label>Price: </label></td>
					<td><form:input path="price" /></td>
				</tr>
				<tr>
					<td><label>Bar Code: </label></td>
					<td><form:input path="barcode" /></td>
				</tr>
				
				<tr>
					<td><label>Category: </label></td>
					<td>
					<form:select path="category">
						
						<c:forEach var="temCategories" items="${categories}">
							<form:option value="${temCategories.id}">${temCategories.name}</form:option>
						</c:forEach>
					
					</form:select>
					</td>
				</tr>
				
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save" /></td>
				</tr>
			</table>

		</form:form>

		

</div>
</div>
<br><br>
<a href="${pageContext.request.contextPath}/configuration/">
Go Back</a>



</body>
</html>