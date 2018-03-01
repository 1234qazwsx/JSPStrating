<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer= "15kb" %>
<!-- 默认是8kb -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("I'm sleping!");
		out.newLine();
		out.println("<br/>");
		
		//out.flush();
		//强制刷新服务器输出缓冲区中的内容，可手动将缓冲区数据输出到浏览器，默认设置为“true”
		
		//out.clearBuffer();  
		//清除缓冲区内容 

		out.clear();
		//清除缓冲区内容 ,如果先前调用了flush，则会产生逻辑错误
		// Error: Attempt to clear a buffer that's already been flushed
		
		out.println("获取缓冲区大小："+out.getBufferSize());
		out.println("<br/>");
		out.println("获取缓冲区剩余大小："+out.getRemaining());
	%>

	
</body>
</html>