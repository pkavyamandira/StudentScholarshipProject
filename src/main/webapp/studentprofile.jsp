<%@page import="com.example.scholarship.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Student s =(Student)session.getAttribute("student");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Home</title>
</head>
<body>
<%@include file="studentnavbar.jsp" %><br/><br/>
<h3 align="center">My Profile</h3>
ID:<%=s.getId()%><br/>
NAME:<%=s.getName()%><br/>
GENDER:<%=s.getGender()%><br/>
DOB:<%=s.getDateofbirth()%><br/>
EMAIL:<%=s.getEmail()%><br/>
LOCATION:<%=s.getLocation()%><br/>
CONTACT:<%=s.getContact()%><br/>
</body>
</html>