<!DOCTYPE html>
<html>
<head>
    <title>Submit Application</title>
</head>
<body>
    <h1>Submit Application</h1>
    <!-- Form submission to the controller endpoint -->
    <form action="${pageContext.request.contextPath}/application/submitApplication" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name">
        <br>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email">
        <br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
