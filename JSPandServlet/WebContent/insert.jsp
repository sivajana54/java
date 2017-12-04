<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Data</title>
</head>
<body>
<%-- % int empId=Integer.parseInt(request.getParameter("EMPLOYEE_ID")); %>
<% String name=(String) request.getParameter("FIRST_NAME"); %>
<%Double salary=Double.parseDouble(request.getParameter("SALARY")); %>
<% int deptId =Integer.parseInt(request.getParameter("DEPARTMENT_ID"));%>
 --%>




<form >
<%-- %request.setAttribute("empId", empId); %>
<%request.setAttribute("name", name); %>
<%request.setAttribute("salary", salary); %>
<%request.setAttribute("deptId", deptId); %> --%>
	<h1>Please Check for your Enter the Detais</h1>
	<ul>
		
	</ul>

</form>
</body>
</html>