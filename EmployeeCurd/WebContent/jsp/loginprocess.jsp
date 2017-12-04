<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="in.vamsoft.training.Dao.LoginDao"%>   
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <jsp:useBean id="obj" class="in.vamsoft.training.model.Login"/>  
  
<jsp:setProperty property="*" name="obj"/>  
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<%  
boolean status=LoginDao.validate(obj);  
if(status){  
out.println("You r successfully logged in");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, Username or Password error");  
%>  
<c:import var="index.html" url="/index.html" />
<%  
}  
%>  

</body>
</html>