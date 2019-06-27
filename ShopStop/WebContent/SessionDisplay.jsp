<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Implicit Objects
</h1>
<% 
out.println("Session id is:"+session.getAttribute("sessionid")+"<br/>");
out.println("locale is:"+session.getAttribute("Locale")+"<br/>");
out.println("locale is:"+session.getAttribute("user")+"<br/>");
%>
<a href= "Session1.jsp">Session scope</a>
</body>
</html>