<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="in.vamsoft.training.model.UserInformation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="welcome.html" %>
 Welcome <%=request.getAttribute("UserName") %> 
 <div style="text-align: right"><a href="LogoutServlet">Logout</a></div>
 <div style="text-align: left"><a href ="ProductServlet">ViewProduct</a>
  <div style="text-align: left"><a href ="PaginationServlet">ViewEmployee</a>
  <div style="text-align: left"><a href ="calulator.html">Calculator</a>
 <div style="text-align: right"> <jsp:include page = "date.jsp" flush = "true" />
 <center><h4>USER-INFORMATION</h4></center>
                <%
                 List<UserInformation> details = (List<UserInformation>) session.getAttribute("UserInformationDetails");
                 %>
                 <%
                          for (UserInformation element : details) {
                        %>
                        <center>
                        <table>
                        <tr><td>FIRST_NAME:<%=element.getFirstName()%></td></tr> 
                       <tr> <td>LAST_NAME:<%=element.getLastName()%></td></tr>
                        <tr> <td>EMAIL:<%=element.getEmail()%></td>
                       </tr>
                       </table>
                      
                        <%
                          }
                        %>
</center>
</body>
</html>