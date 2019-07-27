<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>500错误提示界面</title>
</head>
<body>
<h1>系统异常</h1>
<%=exception.getMessage()%><br>  
<%=exception.getLocalizedMessage()%><br>  
<%=exception.toString()%><br>  
<%=exception.fillInStackTrace()%><br>  
</body>
</html>