EXPERIMENT 9: - jsp page to  displauy simple message
Program: -
  
  
  
Hello.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP - Hello World Tutorial - Programmer Gate</title>
</head>
<body>
<h1>Hello World!</h1>
<h2>Welcome to JSP</h2>
<%
 Date date = new Date();
%>
<p>The current date and time is: <%= date %></p>
</body>
</html> 
