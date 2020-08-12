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
	 	<form:form action="save" modelAttribute="Config"
			method="POST">
			<!-- need to associate this data with customer id -->
			<form:hidden path="Id"/>
			<table>
				<tr>
					<td><label>Company Name: </label></td>
					<td><form:input path="CompanyName" /></td>
				</tr>
				<tr>
					<td><label>Company Description: </label></td>
					<td><form:input path="Description" /></td>
				</tr>
				<tr>
					<td><label>Owner Name: </label></td>
					<td><form:input path="OwnerName" /></td>
				</tr>
				<tr>
					<td><label>Main Email: </label></td>
					<td><form:input path="MainEmail" /></td>
				</tr>
				<tr>
					<td><label>Main Phone: </label></td>
					<td><form:input path="MainPhone" /></td>
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