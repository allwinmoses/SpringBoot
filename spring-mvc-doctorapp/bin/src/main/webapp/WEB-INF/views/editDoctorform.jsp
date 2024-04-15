<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="addDoc.jsp">Add Doctor</a><br>
<a href="deleteDoc.jsp">>Delete</a><br>
<a href="updateDoc.jsp">Update</a>

<%
	pageContext.setAttribute("message","welcome");
	request.setAttribute("message","Good Day in request");
	session.setAttribute("message","Good day in session");
	application.setAttribute("message","Good day in application");
	
%>
<h1>Using Scripting</h1>
<%
String msg1 = (String)request.getAttribute("message");
String msg2 = (String)session.getAttribute("message");
String msg3 = (String)application.getAttribute("message");

%>
<%=msg1 %><br>
<%=msg2 %><br>
<%=msg3 %><br>



%>
</body>
</html>