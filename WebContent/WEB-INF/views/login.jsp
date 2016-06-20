<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your login page</title>
</head>
<body>
<h1>Please login here!</h1>
   <p>${errorMessage}</p>
	<form method="POST" action="/ToDoList/login">
	UserName: <input type="text" name="name">
	PassWord: <input type="password" name="password">
			  <input type="submit" value="login">
	</form>
</body>
</html>