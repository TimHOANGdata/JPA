
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tigre JSP</title>
    </head>
    <body>
         <c:if test="${not empty error}">
            <div id="error-container">
                ${error}
            </div>
        </c:if>   

        <h1>ADD A TIGER:</h1>
         <form method="POST" action="tigre">
            <label for="nom">name :</label><input type="text" name="name" id="name" placeholder="Alexandre"/>
            <label for="country">country :</label><input type="text" name="country" id="country" placeholder="Vietnam"/>
            <label for="age">age :</label><input type="text" name="age" id="age"placeholder="5"/>
            <input type="submit" value="submit"/>
        </form>
         <form method="POST" action="delete">
            <label>enter id of tiger that you want to remove</label><input type="text" name="idString" id="idString"/>
            <input type="submit" value="submit"/>
        </form>
        
        <h1>List of Tiger</h1>
        <ul>
            <c:forEach items="${tigres}" var="tigre">
                
                    <li> name:${ tigre.name } | country: ${ tigre.country } | age: ${ tigre.age }
                
            </c:forEach>                          
        </ul>
        
    </body>
</html>
