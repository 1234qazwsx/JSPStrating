<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> counter </title>
</head>
<body>
<%
	Object obj = application.getAttribute("counter");
	if(obj ==null){
		application.setAttribute("counter",new Integer(1));
		out.println("该页面被访问了1次<br/>");
	}else{
		int counterValue = Integer.parseInt(obj.toString());
		counterValue++;
		out.println("该页面被访问了"+ counterValue + "次<br/>");
		application.setAttribute("counter", counterValue);
		
	}
%>

</body>
</html>