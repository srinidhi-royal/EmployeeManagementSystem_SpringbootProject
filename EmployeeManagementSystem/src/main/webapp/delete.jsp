<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form action="remove" modelAttribute="employee">

<form:label path="id">ENTER ID TO REMOVE EMPLOYEE:</form:label>
<form:input path="id"/>

<input type="submit" value="REMOVE">

</form:form>
 

</body>
</html>