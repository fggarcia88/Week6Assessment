<%@ page language="java"contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@ taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza Planet Arcade Inventory</title>
</head>
<body>
<form action ="createNewRestaurantServlet" method="post">
Address: <input type ="text" name ="addressName"><br />
Manager: <input type ="text" name ="managerName"><br />
Available Items:<br /><select name="allItemsToAdd"multiple size="6">
<c:forEach items="${requestScope.allItems}"var="currentitem">
<option value ="${currentitem.id}">${currentitem.store} |${currentitem.item}</option>
</c:forEach>
</select>
<br />
<input type ="submit" value="Create List and Add Items">
</form>
<a href ="index.html">Go add new items instead.</a>
</body>
</html>