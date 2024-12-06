<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
    <%@ include file="adminnavbar.jsp" %><br/><br/>
    <h3 align="center">Delete Student</h3>
    <table align="center" border="2" class="table table-striped">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>DATE OF BIRTH</th>
            <th>EMAIL</th>
            <th>LOCATION</th>
            <th>CONTACT</th>
            <th>ACTION<th/>
        </tr>
        
<c:forEach items="${studentlist}" var="student">
<tr>
<td><c:out value="${student.id}"></c:out></td>
<td><c:out value="${student.name}"></c:out></td>
<td><c:out value="${student.gender}"></c:out></td>
<td><c:out value="${student.dateofbirth}"></c:out></td>
<td><c:out value="${student.email}"></c:out></td>
<td><c:out value="${student.location}"></c:out></td>
<td><c:out value="${student.contact}"></c:out></td>
<td>
<a href='<c:url value='delete?id=${student.id}'></c:url>'>Delete</a>
</td>
</tr>
</c:forEach>
          
    </table>
</body>
</html>
