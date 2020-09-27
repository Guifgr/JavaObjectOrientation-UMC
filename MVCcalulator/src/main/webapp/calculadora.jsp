<%-- 
    Document   : caculadora
    Created on : Sep 26, 2020, 7:00:01 PM
    Author     : Guifgr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora MVC</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        
        <form method="post" action="operacoes">
            <label for="valor1">Informe valor 1</label>            
            <input type="text" name="valor1">
            <br /><br />
            <label for="valor2">Informe valor 2</label>            
            <input type="text" name="valor2">
            <br /><br />
            <input type="submit" value="soma" name="btnoperacao">
            <input type="submit" value="diferenca" name="btnoperacao">
            <input type="submit" value="multiplica" name="btnoperacao">
            <input type="submit" value="divide" name="btnoperacao">
        </form>
    </body>
</html>
