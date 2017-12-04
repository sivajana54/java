<%@page import="in.vamsoft.training.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="in.vamsoft.training.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product</title>
</head>
<body>
<form action="CartServlet" method="post">
<table>
                        <%
                          List<Product> product = (List<Product>) session.getAttribute("ProductDetailsInformation");
                        %>

                        <%
                          for (Product element : product) {
                        %>
                        <div>
                      
                        <div>
                            <input type="checkbox" name="<%=element.getProductName() %>"
                                value="<%=element.getProductName()%>"><%=element.getProductName()%><br>

                        </div>
                        

                        <%
                          }
                        %>
                    
</div>
                    <div class="container-fluid text-center" style="float: right">
                        <input type="submit" name="submit" value="Book">
                    </div>


</table>
</form>
</body>
</html>