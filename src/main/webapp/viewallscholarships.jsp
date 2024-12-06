<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Scholarships</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        /* Adjust table dimensions */
        table {
            width: 90%;
            margin: 0 auto;
            table-layout: fixed; /* Prevents overly wide columns */
        }
        th, td {
            text-align: center;
            vertical-align: middle;
            padding: 5px; /* Reduces padding to decrease height */
            word-wrap: break-word; /* Breaks long text into multiple lines */
            font-size: 14px; /* Adjust font size for better fit */
        }
        th {
            background-color: #f2f2f2; /* Light gray background for headers */
        }
    </style>
</head>
<body>
    <h3 align="center">View All Scholarships</h3>
    <table align="center" border="1" class="table table-bordered">
        <tr>
            <th>ID</th>
            <th>Scholarship Name</th>
            <th>Description</th>
            <th>Eligibility Criteria</th>
            <th>Application Link</th>
            <th>Deadline</th>
            <th>Duration of Scholarship</th>
            <th>Required Documents</th>
            <th>Action</th> <!-- Added the "Action" column for the Apply button -->
        </tr>

        <!-- Iterate over the scholarships list -->
        <c:forEach items="${scholarships}" var="scholarship">
            <tr>
                <td><c:out value="${scholarship.id}"></c:out></td>
                <td><c:out value="${scholarship.name}"></c:out></td>
                <td><c:out value="${scholarship.description}"></c:out></td>
                <td><c:out value="${scholarship.eligibilityCriteria}"></c:out></td>
                <td><a href="<c:out value='${scholarship.applicationLink}'/>" target="_blank">Link</a></td>
                <td><c:out value="${scholarship.deadline}"></c:out></td>
                <td><c:out value="${scholarship.durationOfScholarship}"></c:out></td>
                <td><c:out value="${scholarship.requiredDocuments}"></c:out></td>
                <td>
                   <!-- Apply button -->
              <form action="applyscholarship" method="get">
              <input type="hidden" name="scholarshipId" value="${scholarship.id}">
              <button type="submit" class="btn btn-primary">Apply</button>
              </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
