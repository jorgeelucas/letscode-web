<%@ page import="br.com.letscode.letscodedemonova.modelo.Pessoa" %>
<%@ page import="java.util.List" %>
<%
    // scriplets
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Lista de pessoas</title>
    </head>
    <body>
        <h3> ${ titulo } </h3>

        <% List<Pessoa> pessoas = (List<Pessoa>) request.getAttribute("pessoas"); %>
        <%
            for(Pessoa pessoa : pessoas) {
            %>
            <ul>
            <li>nome: <%= pessoa.getNome() %></li>
            <li>sobrenome: <% out.println(pessoa.getSobrenome()); %></li>
            <li>idade: <%= pessoa.getIdade() %></li>
            <li>data: <%= pessoa.getData() %> </li>
            </ul>
            <%
            }
        %>
    </body>
</html>