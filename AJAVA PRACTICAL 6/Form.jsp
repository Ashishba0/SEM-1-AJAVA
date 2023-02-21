<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<%
	String studName = request.getParameter("studName");
	String oldCentre = request.getParameter("oldCentre");
	String newCentre = request.getParameter("newCentre");
	%>
	Dear <%=studName%>, your Centre has been changed from <%=oldCentre%> to 
	<%=newCentre%>
</body>
</html>
