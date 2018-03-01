
<%@page import="javax.websocket.Session"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>session test</title>
</head>
<body>
		session示例：<br/>
	
		session唯一标识符：<%= session.getId()	%><br/>
		session创建时间：<%= new Date(session.getCreationTime()).toString()	%><br/>
		session最后访问时间：<%= new Date(session.getLastAccessedTime()).toString()	%><br/>
		session失效时间：<%= session.getMaxInactiveInterval() %><br/>
</body>
</html>