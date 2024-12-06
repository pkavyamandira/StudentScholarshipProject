<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Scholarship</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<h3 align="center">Add Scholarship</h3>

<form method="post" action="insertscholarship" enctype="multipart/form-data">
    <div class="form-group">
        <label for="sname">Scholarship Name</label>
        <input type="text" class="form-control" name="sname" id="sname" required />
    </div>

    <div class="form-group">
        <label for="sdescription">Scholarship Description</label>
        <textarea name="sdescription" class="form-control" id="sdescription" required></textarea>
    </div>

    <div class="form-group">
        <label for="selEligibility">Eligibility Criteria</label>
        <input type="text" class="form-control" name="selEligibility" id="selEligibility" required />
    </div>

    <div class="form-group">
        <label for="slink">Application Link</label>
        <input type="url" class="form-control" name="slink" id="slink" required />
    </div>

    <div class="form-group">
        <label for="sdeadline">Deadline</label>
        <input type="date" class="form-control" name="sdeadline" id="sdeadline" required />
    </div>

    <div class="form-group">
        <label for="simage">Duration of Scholarship</label>
        <input type="text"  class="form-control" required />
    </div>

       <div class="form-group">
        <label for="sdocuments">Required Documents</label>
        <input type="text" class="form-control" name="sdocuments" id="sdocuments" placeholder="e.g., Transcripts, Essay, Proof of Enrollment" required />
    </div>



    <input type="submit" value="Add" class="btn btn-success"/>
    <input type="reset" value="Clear" class="btn btn-danger"/>
</form>

</body>
</html>
