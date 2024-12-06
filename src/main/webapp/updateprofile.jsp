<%@page import="com.example.scholarship.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Student s = (Student) session.getAttribute("student");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Profile</title>
</head>
<body>
    <%@include file="studentnavbar.jsp" %>
	<h3 align="center">Student Update Profile Form</h3>
	<div class="container">
	<form method="post" action="update">
	<label>ID</label>
		<input type="number" class="form-control" name="sid" value="<%=s.getId()%>" readonly required />
		<br/>
		<label>Enter Name</label>
		<input type="text" class="form-control" name="sname" value="<%=s.getName()%>" required />
		<br/>
		<label>Select Gender</label>
				<input type="radio" name="sgender" class="form-check-input" value="Male" required />Male
				<input type="radio" name="sgender" class="form-check-input" value="Female" required />Female
				<input type="radio" name="sgender" class="form-check-input" value="Others" required />Other
				<br/>
				<label>Select Date of Birth</label>
				<input type="date" name="sdob" class="form-control"  value="<%=s.getDateofbirth()%>" required />
				<br/>
				<label>Enter Email ID</label>
				<input type="email" name="semail" class="form-control" value="<%=s.getEmail()%>" readonly required />
				<br/>
				<label>Enter Password</label>
				<input type="password" name="spwd" class="form-control" value="<%=s.getPassword()%>" required />
				<br/>
				<label>Enter Location</label>
				<input type="text" name="slocation" class="form-control" value="<%=s.getLocation()%>" required />
				<br/>
				<label>Enter contact</label>
				<input type="number" name="scontact" class="form-control" value="<%=s.getContact()%>" required />
				<br/>
<input type="submit" value="Update" class="btn btn-success"/>
<input type="reset" value="clear" class="btn btn-success"/>

	</form>
	</div>
</body>
</html>
