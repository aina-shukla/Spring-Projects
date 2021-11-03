<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to MVC Application</title>
</head>
<body style="background-color: powderblue; font-family: verdana">
	<!-- My name is ${uname} and password is ${password}   -->
	<!-- <br> MVC application check
	<br> My First Servlet is working
	<br> Application check done..  -->
	<!-- Scriptlets - Java in jSP below -->
	<%
	//System.out.println("Data from JSP");
	//System.out.println(request.getParameter("uname"));
	//Date date= new Date();
	%>
	<p><font color="red">${errorMessage}</font></p>
	<form action="/login.do" method="post">
	Username: <input type="text" name="uname" placeholder="username"/><br>
	Password: <input type="password" name="password" placeholder="password"/><br>
	<input type ="submit" value="Login"/>
	</form>
	
	
</body>
</html>