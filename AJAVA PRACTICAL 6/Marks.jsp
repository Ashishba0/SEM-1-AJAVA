<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%
	int Java = Integer.parseInt(request.getParameter("Java"));
	int DBMS = Integer.parseInt(request.getParameter("DBMS"));
	int WTL = Integer.parseInt(request.getParameter("WTL"));
	int MFCS = Integer.parseInt(request.getParameter("MFCS"));
	int DSL = Integer.parseInt(request.getParameter("DSL"));

	int c = Java + DBMS + WTL + MFCS + DSL;
	double avg = c / 5;

	if (avg > 90) {
		out.println(" your grade is A");
	} else if (avg >= 80) {
		out.println("your grade is B");
	} else if (avg >= 70) {
		out.println("your grade is C");
	} else if (avg >= 60) {
		out.println("your grade is D");
	} else {
		out.println("your grade is E");
	}
	%>
</body>
</html>
