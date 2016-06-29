 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js" type="text/javascript"></script>
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/login.css"/>
	<script  src="<c:url value='/resources/js/login.js'/>" type="text/javascript"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your login page</title>
</head>
<body >
    <div class="header">
    	<div class="container">
    		Welcome to your <br><span id="todo">to do list!</span>
    	</div>
    	</div>
   
    <div class="main">
    	<div class="container">
    		<p>${errorMessage}</p>
    			<table class="table">
    			 
				<form:form class="form" method="POST" action="/ToDoList/login" modelAttribute="firstuser" > 
					<tr>
						<td><form:label path="name">UserName:</form:label></td>
			 			<td><form:input type="text"  path="name" required="required"/></td>
			 		</tr>
			 		<tr>
			 			<td><form:label path="password">PassWord:</form:label></td>
			 			<td><form:input type="text" path="password" required="required"/></td>
			 		</tr>
			        <tr><td colspan="2"><input type="submit" value="login" class="btn"/></td></tr>
				</form:form>
				</table>
		</div>
	</div>
</body>
</html>