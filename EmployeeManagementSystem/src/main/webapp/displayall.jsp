<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>DISPLAY ALL EMPLOYEE DETAILS</h2>  
 <table border="2">
<tr>
<th>EMPLOYEE ID</th>
<th>EMPLOYEE NAME</th>
<th>EMPLOYEE DESIGNATION</th>
<th>EMPLOYEE SALARY</th>
</tr>
<c:forEach items="${employeelist}" var="employee">
  <tr>
 <td>${employee.id}</td>
 <td>${employee.name}</td>
 <td>${employee.designtion}</td>
 <td>${employee.salary}</td>
 </tr>
</c:forEach>
</table>
<br><br>
<button><a href="Index.jsp">BACK HOME</a></button>

</body>
</html>