<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="do_register.jsp" method="post">
	用户名：<input type="text" name="userName"/><br/>
	技能：
	<input type="checkbox" name="skills" value="java"/>java
	<input type="checkbox" name="skills" value="c++"/>c++
	<input type="checkbox" name="skills" value="Go"/>go
	<input type="checkbox" name="skills" value="python"/>python
	<input type="checkbox" name="skills" value="prolog"/>prolog 
	<br/>
	
	<input type="submit" name="提交"><br/>
	<input type="reset" name="重置"><br/>
</form>

</body>
</html>