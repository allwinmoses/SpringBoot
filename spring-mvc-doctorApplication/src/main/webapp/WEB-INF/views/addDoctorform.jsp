<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Doctor</title>
</head>
<body>
<h1>Add Doctor</h1>
<form action="addDoctor">
	DoctorName: <input type="text" name ="doctorname"> <br>
	Speciality: <input type="text" name="speciality"> <br>
	fees: <input type="number" name="fees"><br>
	Rating:<input type="number" name="ratings"><br>
	Experience: <input type="number" name="experience"><br>
	
	<input type="submit" value="add Doctor">
</form>

</body>
</html>