<%@page import="in.vamsoft.model.Department"%>
<%@page import="in.vamsoft.dao.EmployeeDaoImpl,java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="EmployeeDetails" method="post">
<select name ="DEPARTMENT_NAME">
<%
EmployeeDaoImpl dao= new  EmployeeDaoImpl();
List<Department> depat= dao.getAllDepartment();
for(Department d:depat){

%>
<option value="<%=d.getDEPARTMENT_ID()%>"><%=d.getDEPARTMENT_ID() +":"+d.getDEPARTMENT_NAME()%></option>
<%} %>


</select>
<input type="submit" value="submit">
</form>
</body>
</html>