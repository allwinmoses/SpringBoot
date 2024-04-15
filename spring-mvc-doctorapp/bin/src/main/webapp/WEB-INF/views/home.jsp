<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style ="text-align:right">
<a href="admin">Admin</a>
</div>

<form action="search">
	Enter Speciality<input type="text" name ="choice"><br>
<input type="submit" value="Search"><br>

</form>

<h2>All Doctors</h2>
${doctors }
<h2 style="{color:red}">${message }</h2>

</body>
</html>