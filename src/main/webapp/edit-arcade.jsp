<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="editItemServlet" method="post">
Title: <input type ="text" name ="title" value="${itemToEdit.title}">
Cost Per Play: <input type ="text" name ="costPerPlay" value="${itemToEdit.costPerPlay}">
Purchased Price: <input type ="text" name ="purchasePrice" value="${itemToEdit.purchasePrice}">
<input type ="hidden" name ="id" value="${itemToEdit.id}">
<input type ="submit" value="Save Edited Item">
</body>
</html>