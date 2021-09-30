<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Pizza Planet Arcade Inventory</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<header>
			<img src="pizzaplanetlogo.jpg" class="center">
		</header>
        <div class="formcontainer">
			<h1>Arcade Inventory</h1>
			<form method="post" action="navigationServlet">
			<table>
                <tr class="tableheader">
                    <th>Title</th>
                    <th>Cost/Play</th>
                    <th>Purchased Price</th>
                </tr>                
                <c:forEach items="${requestScope.allItems}" var="currentitem">
                <tr>
                	<td><input type="radio" name="id" value="${currentitem.id}">${currentitem.title} </td>
					<td>${currentitem.costPerPlay}</td>
					<td>${currentitem.purchasePrice}</td>					
				</tr>
				</c:forEach>
			</table>
			<input type="submit" value="Edit" name="doThisToItem">
			<input type="submit" value="Delete" name="doThisToItem">
			<input type="submit" value="Return" name ="doThisToItem">
			</form>
		</div>
	</body>
</html>