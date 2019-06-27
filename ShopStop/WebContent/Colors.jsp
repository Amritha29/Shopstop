<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Embedding code</title>
</head>
<%!
String[] names={"Palegreen", "Cyan","Skyblue","DarkSalmon","Yellow","Pink"};
%>
<body>
<h1> List of Colors </h1>
<table border="0">
<th> Name </th>
<%
for(int i=0; i<names.length; i++)
{
%>
<tr>
<td bgcolor="<%= names[i] %>" width="200 " > <%= names[i]%> </td>
</tr>

<%
}
%>
</table>
</body>
</html>