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
            <form action ="editItemServlet" method="post">
            Title: <input type ="text" name ="title" value="${itemToEdit.title}">
            <br>
            Cost Per Play: <input type ="text" name ="costPerPlay" value="${itemToEdit.costPerPlay}">
            <br>
            Purchased Price: <input type ="text" name ="purchasePrice" value="${itemToEdit.purchasePrice}">
            <br>
            <input type ="hidden" name ="id" value="${itemToEdit.id}">
            <input type ="submit" value="Save Edited Item">
            </form>
        </div>
    </body>
</html>