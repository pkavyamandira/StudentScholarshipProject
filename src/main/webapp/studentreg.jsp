<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
    <%@include file="mainnavbar.jsp" %>
	<h3 align="center">Student Registration Form</h3>
	<div class="container">
	<form method="post" action="insertstudent">
		<label>Enter Name</label>
		<input type="text" class="form-control" name="sname" required />
		<br/>
		<label>Select Gender</label>
				<input type="radio" name="sgender" class="form-check-input" value="Male" required />Male
				<input type="radio" name="sgender" class="form-check-input" value="Female" required />Female
				<input type="radio" name="sgender" class="form-check-input" value="Others" required />Other
				<br/>
				<label>Select Date of Birth</label>
				<input type="date" name="sdob" class="form-control" required />
				<br/>
				<label>Enter Email ID</label>
				<input type="email" name="semail" class="form-control" required />
				<br/>
				<label>Enter Password</label>
				<input type="password" name="spwd" class="form-control" required />
				<br/>
				<label>Enter Location</label>
				<input type="text" name="slocation" class="form-control" required />
				<br/>
				<label>Enter contact</label>
				<input type="number" name="scontact" class="form-control" required />
				<br/>
<input type="submit" value="Register" class="btn btn-success"/>
<input type="reset" value="clear" class="btn btn-success"/>

	</form>
	</div>
</body>
</html>
