<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/list-todos.css"/>
	<script  src="<c:url value='/resources/js/list-todos.js'/>" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your todo list for ${name}</title>
</head>
<body>
   <div class="header">
   		<div class="container">
   			Here is your to do list!
   		</div>
   </div>
  
   <div class="main">
   	<div class="container">
<!--    			<a href="/ToDoList/logout">Logout</a> -->
	<table class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th>Checked</th>
				<th>Operation</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
			<tr>
				<th>${todo.description}</th>
				<th><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.date}"/></th>
				<th>${todo.checked}</th>
				<th><a class="link" type="button" href="/ToDoList/update-todo?id=${todo.id}">Edit</a>
					<a class="link" type="button" href="/ToDoList/delete-todo?id=${todo.id}">Delete</a>
				</th>
			</tr>
			</c:forEach>
		</tbody>
	</table>

   		
   	</div>
   </div>
	<a type="button" class="btn" href="/ToDoList/add-todo">Add</a>
	
	
         
</body>
</html>