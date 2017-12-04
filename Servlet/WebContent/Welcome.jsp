<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> hai welcome to java</h1>
<% for (int i=0;i<=9;i++){
  out.println(i);
  
}%>

<%!int add(int n1,int n2){
 return n1+n2;
} %>

<%= "The sum of this"+add(5,6) %>
</body>
</html>