<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Category</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >

</head>
<body>

<div>
<div class="container">
		<h3>Save Category</h3>
	 	<form:form action="save-category" modelAttribute="Category"
			method="POST">
			<!-- need to associate this data with customer id -->
			<form:hidden path="Id"/>
			<table>
				<tr>
					<td><label>Category Name: </label></td>
					<td><form:input path="name" /></td>
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