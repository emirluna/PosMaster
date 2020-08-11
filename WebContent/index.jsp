<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POS - Point Of Sales</title>

<link type="text/css"
	  rel="stylesheet" 
	  href="${pageContext.request.contextPath}/resources/css/bootstrap.css" >

</head>
<body>

<div class="jumbotron text-center">
<h1>Here will be the Header</h1>
</div>

Pagina de inicio (Será reemplazada por Login
<br>
the content will be shown on Dashboar page)
<br><br>


<div class="container">
 <div class="row">
 <div class="col-sm-4">
<a href="${pageContext.request.contextPath}/configuration/">Configurations</a>
(Show a little important information about configuration: Time zone, Currency, last connection)
<br><br>
 </div>
    <div class="col-sm-4">	
<a href="${pageContext.request.contextPath}/branches/">Branches</a>
(Show the name of the Active Branches and Status)
<br><br>
 </div>
    <div class="col-sm-4">
<a href="${pageContext.request.contextPath}/products/">Products</a>
(Show three lists: Products most sold, low stock and close to expire)
(Show a samll graph to)
<br><br>
 </div>
    <div class="col-sm-4">
<a href="${pageContext.request.contextPath}/customers/">Customers</a>
(Two list: the most active customers and the customers with debt)
<br><br>
 </div>
    <div class="col-sm-4">
<a href="${pageContext.request.contextPath}/users/">Users</a>
(A list of active users and status)

<br><br>
</div>
</body>
</html>