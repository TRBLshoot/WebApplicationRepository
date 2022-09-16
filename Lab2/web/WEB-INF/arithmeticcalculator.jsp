<%-- 
    Document   : arithmeticcalculator
    Created on : 16-Sep-2022, 12:43:56 PM
    Author     : Dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <label>First:</label>
            <input type="text" name="firstInput" id="firstInput" value="<%= request.getAttribute("firstInputField") %>">
            
            <label>Second</label>
            <input type="text" name="secondInput" id="secondInput" value="<%= request.getAttribute("secondInputField") %>">
          
            <button type="submit" name="operation" value="1">+</button>
            <button type="submit" name="operation" value="2">-</button>
            <button type="submit" name="operation" value="3">*</button>
            <button type="submit" name="operation" value="4">/</button>
        </form>
        <div>
        <% if(request.getAttribute("arithmeticOutputField") != null) { %>
        <%= request.getAttribute("arithmeticOutputField") %>
        <% } %>
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>