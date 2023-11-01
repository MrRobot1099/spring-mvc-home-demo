<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Cafe</title>
</head>
<body>
	<form action="processOrder">
		<div align="center">
			<h1 align="center">MOM'S CAFE</h1>
			<hr>
			<label for="itemName">Item Name : </label> <input type="text"
				name="foodType" placeholder="enter food type" id="itemName">
			<input type="submit" value="order now">
		</div>
	</form>
</body>
</html>