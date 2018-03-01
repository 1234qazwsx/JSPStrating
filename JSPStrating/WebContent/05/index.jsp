<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:forward page="login.jsp">
<jsp:param value="mouron" name="userName"/>
<jsp:param value="12345" name="passWord"/>
</jsp:forward>


包括这行及其以下不会被执行
THIS IS MY JOB;