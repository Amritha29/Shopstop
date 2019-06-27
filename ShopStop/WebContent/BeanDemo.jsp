<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using JavaBean in JSP</title>
<jsp:useBean id="BeanId" class="beans.SimpleBean" scope="application"/>
<jsp:setProperty name="BeanId" property="name" value="Andrew"/>
<jsp:setProperty name="BeanId" property="age" value="25"/>
</head>
<body>
Name is  : <jsp:getProperty name="BeanId" property="name"/><br>
Age is : <jsp:getProperty name="BeanId" property="age"/><br>
</body>
</html>