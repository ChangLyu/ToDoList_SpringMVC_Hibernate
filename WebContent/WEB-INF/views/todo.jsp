<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/todo.css"/>
	<script  src="<c:url value='/resources/js/todo-add.js'/>" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>To Do</title>
<!-- <a href="/ToDoList/logout">Logout</a> -->
</head>
<body>
    <div class="main">
    <div class="container">
    	<form:form action="/ToDoList/update-todo" method="post" modelAttribute="todo">
    			<form:hidden path="id"/>
    	<table class="table">
    		<tr> <td><form:label path="description">Description</form:label></td>
    		<td><form:input path="description" type="text"  required="required"/></td></tr>
    		<tr><td><form:label path="date">Date</form:label></td>
    		<td><form:input path="date" type="text"  required="required"/></td></tr>
    	</table>
    	<button class="btn" type="submit" value="submit">Update</button>
       </form:form>
    </div>
    </div>
</body>
</html>