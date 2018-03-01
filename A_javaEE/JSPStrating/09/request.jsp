<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>request 示例</title>
</head>
<body>
<form action="" method = "post">

	<input type="text" name="userName" />
	<input type="submit" name="提交" />
	
</form>

请求方法名：<%= request.getMethod() %><br/>
请求资源名：<%= request.getRequestURI() %><br/>
请求使用的协议：<%= request.getProtocol()  %><br/>
请求的服务器名：<%= request.getServerName() %><br/>
请求使用的端口号：<%= request.getServerPort() %><br/>
客户端的地址：<%= request.getRemoteAddr() %><br/>
客户端主机名：<%= request.getRemoteHost() %><br/>
提交的表单数据：<%= request.getParameter("userName") %><br/>
<!-- 方法名称要和表单的保持一致-->



</body>
</html>