
<%@page import="in.vamsoft.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<body>

    <form>
        <table class="table">

            <%
              List<Employee> list = (List<Employee>) session.getAttribute("emp");
              if (list.size() > 0) {
            %>
            <tr>
                <td><h1>Employee Id</h1></td>
                <td><h1>Employee Name</h1></td>
                <td><h1>Employee Salary</h1></td>
              
                <td><h1>Dept No</h1></td>
            </tr>
            <%
              for (Employee l : list) {
            %>
            <tr>
                <td><%=l.getEMPLOYEE_ID()%></td>
                <td><%=l.getFIRST_NAME()%></td>
                <td><%=l.getSALARY()%></td>
               
                <%-- <td><%=l.getDEPARTMENT_ID()%></td> --%>
            </tr>


            <%
              }
              } else {
            %>
            <th>no data</th>
            <%
              }
            %>

        </table>
    </form>


</body>
</html>
