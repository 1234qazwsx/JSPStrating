<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册信息处理</title>
</head>
<body>
	<jsp:useBean id="user" class="com.test.entity.UserEntity"></jsp:useBean>
	<jsp:setProperty property="userName" name="user"/>
	<jsp:setProperty property="passWord" name="user"/>

<%
	String userName = request.getParameter("userName");
	//reguest 封装了客户的请求信息
	String passWord = request.getParameter("passWord");
	out.println("<br/>");
	out.println(userName);
	out.println("<br/>");
	out.println(passWord);

%>
<br/>
<jsp:getProperty property="userName" name="user"/>
<br/>
<jsp:getProperty property="passWord" name="user"/>

</body>
</html>