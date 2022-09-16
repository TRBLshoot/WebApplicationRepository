<%-- 
    Document   : agecalculator
    Created on : 16-Sep-2022, 10:19:00 AM
    Author     : Dylan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            <label>Enter your age:</label>
            <input type="number" name="ageInput" id="ageInput" value="">
            
            <button type="submit" value="">Age next Birthday</button>
        </form>
        <div>
        <% if(request.getAttribute("ageOutputField") != null) { %>
        <%= request.getAttribute("ageOutputField") %>
        <% } %>
        </div>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>