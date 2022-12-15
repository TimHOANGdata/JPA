<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>List of clients</h1>
        <ul>
            <c:forEach items="${clients}" var="client">
                
                    <li> First name:${client.firstName} |  Last name:${client.lastName} |  Email :${client.email} | 
                          phone :${client.telephone} |  address :${client.address} |  zipCode :${client.zipCode} | 
                           city :${client.city} |  country :${client.country} 
            </c:forEach>                          
        </ul>
                 <h1>List of orders</h1>    
        <ul>
            <c:forEach items="${orders}" var="order">
                
                    <li> Type Presta :${order.typePresta} |  designation :${order.designation} |  nbdays :${client.nbdays} | 
                          unit price :${order.unitPrice} 
            </c:forEach>                          
        </ul>    
    </body>
</html>
