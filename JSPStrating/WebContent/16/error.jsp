<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Errors</title>


<style type="text/css">
	body {
		color: #000;
		font-size: 14px;
		margin: 20px auto;
}

#message{
	text-align: center;
}
</style>

</head>
<body>
	<div id="message">
		登陸失败：<br/>
		错误提示：
		<%
			Object obj = request.getAttribute("msg");
			if(obj != null){
				out.println(obj.toString());
			}else{
				out.println("无");
			}
		%>
		您提交的信息为：<br/>
		用户名：<%= request.getParameter("uname") %><br/>
		密码：<%= request.getParameter("passwd") %><br/>
		<a href="<%= request.getContextPath() %>/16/login.jsp">返回登陆页面</a>
	</div>	
</body>
</html>