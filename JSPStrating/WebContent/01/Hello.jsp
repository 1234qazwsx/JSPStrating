<%@page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!-- 默认是ISO-8859-1 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
JSP 表达式输出:<%="Hello world"%>
<br/>
<%!  
	String str = "Hello world"; 
	//jsp声明代码，是全局变量
%>
<%
	//String str = "Hello world";
	out.println(str);
%>

<!-- this is html comment -->
<!-- today is <%=new  java.util.Date().toString() %> -->

<%-- this is Jsp comment --%>
</body>
</html>