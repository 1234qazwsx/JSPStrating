<%@page import="java.net.CookieHandler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>response 03 test</title>
</head>
<body>
<%
	Cookie mycookie = new Cookie("mouron","1234567890");
	mycookie.setMaxAge(3600);
	//最大存活时间
	response.addCookie(mycookie);
%>

</body>
</html>