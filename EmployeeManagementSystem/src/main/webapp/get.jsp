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
<form:form action="display" modelAttribute="employee">

<form:label path="id">ENTER ID TO SEARCH:</form:label>
<form:input path="id"/>

<input type="submit" value="SEARCH">

</form:form>

</body>
</html>