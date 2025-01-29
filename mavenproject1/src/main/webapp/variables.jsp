<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Variables del Sistema</title>
</head>
<body>
    <h1>Variables del Sistema</h1>
    <table border="1">
        <tr>
            <th>Nombre de la Variable</th>
            <th>Valor</th>
        </tr>
        <% 
            Map<String, String> env = System.getenv();
            for (Map.Entry<String, String> entry : env.entrySet()) {
        %>
        <tr>
            <td><%= entry.getKey() %></td>
            <td><%= entry.getValue() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
