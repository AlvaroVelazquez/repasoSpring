<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertar nueva mascota</title>
</head>
<body>
	<form:form action="addPet" method="post" modelAttribute="pet">
		<span>Name:</span><form:input type="text" name="name" path="name"/>
		<input type="submit">
	</form:form>
</body>
</html>