<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/todo-add.css"/>
	<script  src="<c:url value='/resources/js/todo-add.js'/>" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="main">
    <div class="container">
    	<form:form action="/ToDoList/add-todo" method="post" modelAttribute="todoadd">
    			
    	<table class="table">
    		<tr> <td><form:label path="description">Description</form:label></td>
    		<td><form:input path="description" type="text"  required="required"/></td></tr>
    		<tr><td><form:label path="date">Date</form:label></td>
    		<td><form:input path="date" type="text"  required="required"/></td></tr>
    		
    	</table>
    	<button class="btn" type="submit" value="submit">Add</button>
       </form:form>
    </div>
    </div>
</body>
</html>