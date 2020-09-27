<%-- 
    Document   : resultado
    Created on : Sep 26, 2020, 7:23:41 PM
    Author     : Guifgr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <% 
            String mensagem = (String) request.getAttribute("mensagem");
            Double resultado = (Double) request.getAttribute("resultado");
        %>
        
        <h2>
            <% 
                out.println(mensagem+resultado); 
            %>
        </h2>
    </body>
</html>
