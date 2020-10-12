<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Digite a velocidade e o limite do local</h1>
        <form method="post" action="multaCalculo">
            <input name="velocidade" id="velocidade" placeholder="Velocidade">
            <br />
            <input name="limite" id="limite" placeholder="limite">
            <br />
            <input name="enviar" id="enviar" placeholder="enviar" type="submit" value="calcular">            
        </form>
    </body>
</html>
