<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>Random Numbers</title>
<link rel="stylesheet"
      href="./css/styles.css"
      type="text/css"/>
</head>
<body>
<div align="center">
<table border="5">
  <tr><th class="title">Random Numbers</th></tr>
</table>
<p/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
<c:forEach var="i" begin="1" end="13">
  <li><%= Math.random() %></li>
</c:forEach>
</ul>
</div></body></html>