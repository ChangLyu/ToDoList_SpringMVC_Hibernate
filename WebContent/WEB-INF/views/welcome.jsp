<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
	
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/welcome.css"/>
	<script  src="<%=request.getContextPath()%>/resources/js/welcome.js" type="text/javascript"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<div class="container">Welcome, ${name}.</div>
	</div>
	
	<div class="main">
		<div class="container"><a href="/ToDoList/list-todos">Click here </a>to begin maintaining your todo-lists.
		</div>
	</div>


</body>
</html>