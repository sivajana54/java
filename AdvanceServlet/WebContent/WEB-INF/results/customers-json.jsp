<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
[<c:forEach var="customer" items="${customers}" varStatus="status">
   { id: "${customer.customerID}",
     firstName: "${customer.firstName}",
     lastName: "${customer.lastName}",
     balance: "${customer.formattedBalance}" }
   <c:if test="${!status.last}">,</c:if>
 </c:forEach>]