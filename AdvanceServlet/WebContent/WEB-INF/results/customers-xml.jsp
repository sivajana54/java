<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<customers>
<c:forEach var="customer" items="${customers}">
  <customer>
    <id>${customer.customerID}</id>
    <firstName>${customer.firstName}</firstName>
    <lastName>${customer.lastName}</lastName>
    <balance>${customer.formattedBalance}</balance>
  </customer>
</c:forEach>
</customers>