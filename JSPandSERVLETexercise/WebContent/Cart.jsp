<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="in.vamsoft.training.model.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
               <%
                 List<Product> details = (List<Product>) session.getAttribute("BookedProductItem");
                 %>
                 <%
                          for (Product element : details) {
                        %>
                        <div>
                            <input type="checkbox" name="<%=element.getProductId() %>"
                                value="<%=element.getProductName()%>"><%=element.getProductName()%><br>

                        </div>
                      
                        <%
                          }
                        %>
                      
                  
</div>
                    <div class="container-fluid text-center" style="float: right">
                        <input type="submit" name="submit" value="Remove">
                    </div>
</body>
</html>