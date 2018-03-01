<%@page import="java.util.Date"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>response test</title>
</head>
<body>

<%
	response.setHeader("Cache-Conrtrol","no-cache");
	// 这里是否将网页信息存入缓存，值有 public 、private、no-store
	response.setIntHeader("Refresh", 2);
	out.println("data is "+ new Date().toString() + "<br/>");
%>
</body>
</html>