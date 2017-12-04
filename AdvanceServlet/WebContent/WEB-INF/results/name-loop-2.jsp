<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>Names</title>
<link rel="stylesheet"
      href="./css/styles.css"
      type="text/css"/>
</head>
<body>
<div align="center">
<table border="5">
  <tr><th class="title">Names</th></tr>
</table>
<p/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1">
  <tr><th>First Name</th><th>Last Name</th></tr>
<c:forEach var="name" items="${names}">
  <tr><td>${name.first}</td><td>${name.last}</td></tr>
</c:forEach>
</table>
</div></body></html>