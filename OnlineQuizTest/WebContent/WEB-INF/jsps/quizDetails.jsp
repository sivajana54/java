<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="position:absolute;left:120px;top:60px">
<table cellpadding="0" cellspacing="50">

<tr>
<td><a href="takeExam?test=java"><img height="200" width="200" src="${pageContext.request.contextPath}/images/java.png"/></a></td>
<td><a href="takeExam?test=javascript"><img height="200" width="200" src="${pageContext.request.contextPath}/images/javascript.png"/></a></td>
<td><a href="takeExam?test=sql"><img height="200" width="200" src="${pageContext.request.contextPath}/images/sql-logo.png"/></a></td>
<td><a href="takeExam?test=python"><img height="200" width="200" src="${pageContext.request.contextPath}/images/python.jpg"/></a></td>
</tr>

<tr>
<td><a href="takeExam?test=css"><img height="200" width="200" src="${pageContext.request.contextPath}/images/css.jpg"/></a></td>
<td><a href="takeExam?test=php"><img height="200" width="200" src="${pageContext.request.contextPath}/images/php-logo.jpg"/></a></td>
<td><a href="takeExam?test=linux"><img height="200" width="200" src="${pageContext.request.contextPath}/images/logo-linux.png"/></a> </td>
<td><a href="takeExam?test=mongodb"><img height="200" width="200" src="${pageContext.request.contextPath}/images/mongodb_logo.png"/></a></td>
</tr>

</table>
</div>
</body>
</html>