<%-- 
    Document   : resultado
    Created on : Oct 1, 2020, 8:38:43 PM
    Author     : Guifgr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Multa!</title>
    </head>
    <body>
        <% String mensagem = (String)request.getAttribute("mensagem");%>
        <h1><% out.println(mensagem); %></h1>
        <a href="index.jsp">Voltar ao inicio</a>        
    </body>
</html>
