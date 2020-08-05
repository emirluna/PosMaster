<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu for Configurations</title>
</head>
<body>
<div>
<div>
<h2>Current Configuration</h2>
<ol>
	<li>Configuration One</li>
	<li>Configuration Two</li>
	<li>Configuration Three</li>
</ol>
<a href="${pageContext.request.contextPath}/editConfiguration/">
Edit Configuration</a>
<br><br>
<a href="${pageContext.request.contextPath}/deleteConfiguration/">
Set Default Configuration</a>
<br><br>
</div>

<br><br>
<a href="${pageContext.request.contextPath}">
Go Back</a>
<br><br>


</body>
</html>