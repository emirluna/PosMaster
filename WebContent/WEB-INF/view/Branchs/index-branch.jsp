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
<div>
<h2>Active Branches</h2>
<table>
	<tr>
		<td>Branches One</td>
		<td><a href="${pageContext.request.contextPath}/editBranch/">
Edit Branch</a></td>
		<td><a href="${pageContext.request.contextPath}/deleteBranch/">
Delete Branch</a></td>
	</tr>
	<tr>
		<td>Branches Two</td>
		<td><a href="${pageContext.request.contextPath}/editBranch/">
Edit Branch</a></td>
		<td><a href="${pageContext.request.contextPath}/deleteBranch/">
Delete Branch</a></td>
	</tr>
</table>

</div>

<br><br>
<a href="${pageContext.request.contextPath}">
Go Back</a>
<br><br>


</body>
</html>