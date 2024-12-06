<!DOCTYPE html>
<html>
<head>
    <title>Apply for Scholarship</title>
    <style>
        /* Style the submit button */
        .submit-button {
            background-color: #4CAF50; /* Green */
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .submit-button:hover {
            background-color: #45a049;
        }

        .form-container {
            margin: 20px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 50%;
            margin-left: auto;
            margin-right: auto;
        }

        label {
            font-size: 16px;
        }

        input[type="file"] {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h2>Apply for Scholarship: ${scholarship.name}</h2>

    <div class="form-container">
        <form action="/submitApplication" method="POST" enctype="multipart/form-data">
            <!-- Ensure the studentId is passed as a hidden input -->
            <input type="hidden" name="studentId" value="${student.id}" />
            <input type="hidden" name="scholarshipId" value="${scholarship.id}" />

            <label for="documents">Upload PDF Document</label><br><br/>
            <input type="file" name="documents" accept=".pdf" required /><br><br>

            <button type="submit" class="submit-button">Submit Application</button>
        </form>
    </div>
</body>
</html>
