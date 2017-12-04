<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
        <%@page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<String> names=new ArrayList<String>();
names.add("siva");
names.add("jana");
pageContext.setAttribute("names", names);
%>
<strong>Employee from request:</strong>${requestScope.employee}
<br>
<br>
<Strong>Employee without scope:</Strong>${employee}
<br>
<br>
<Strong>Using[]:</Strong>${applicationScope["User.Cookie"] }
<br>
<br>
<Strong>Printing employee's city:</Strong>${sessionScope.employee1.address.city }
<br>
<br>
<Strong>Printing first element of list:</Strong>${names[1]}
<br>
<br>
<Strong>Header Information:</Strong>${header["Accept-Encoding"]}
<br>
<br>
<Strong>Assessing Cookie:</Strong>${cookie["User.Cookie"].value}
<br>
<br>
<Strong>Getting the request method from pageContext:</Strong>HTTP method is ${pageContext.request.method}
<br>
<br>
<Strong>Getting Context param:</Strong>${initParam.DummyParam}
<br>
<br>
<Strong>Getting Request param:</Strong>${param.name}
<br>
<br>
</body>
</html>