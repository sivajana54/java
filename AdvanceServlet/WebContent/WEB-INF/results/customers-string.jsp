<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="customer" items="${customers}">
${customer.customerID}#${customer.firstName}#${customer.lastName}#${customer.formattedBalance}
</c:forEach>