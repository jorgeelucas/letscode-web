<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <h1><%= "APP de Pessoas" %>
        </h1>
        <br/>
        <ul>
            <li>
                <a href="/app/controlador?acao=cadastrar-pessoas-form">Cadastrar pessoa</a>
            </li>
            <li>
                <a href="/app/controlador?acao=listar-pessoas">Listar pessoas</a>
            </li>
        </ul>
    </body>
</html>