<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="in.vamsoft.training.model.Product">
            <jsp:setProperty name="obj" property="*"/>
        </jsp:useBean>
        <h3> bean action tags</h3>
        Hello <jsp:getProperty name="obj" property="productId"/><p>
        <jsp:getProperty name="obj" property="productName"/><p>
        <jsp:getProperty name="obj" property="langComments"/><p>
        <h3>Result </h3> ProductId : <%= obj.getProductId()%><br> ProductName : <%= obj.getProductName()%><br> 
</body>
</html>