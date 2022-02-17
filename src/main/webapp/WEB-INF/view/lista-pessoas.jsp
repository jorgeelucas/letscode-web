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

        <table width="500" border="1px">
            <tr>
                <th>NOME</th>
                <th>SOBRENOME</th>
                <th>IDADE</th>
                <th>DATA</th>
            </tr>
        <%
            for(Pessoa pessoa : pessoas) {
            %>
            <tr>
                <td><%= pessoa.getNome() %></td>
                <td><%= pessoa.getSobrenome() %></td>
                <td><%= pessoa.getIdade() %></td>
                <td><%= pessoa.getData() %></td>
            </tr>
            <%
            }
        %>
        </table>
        <button onclick="window.location.href='/app/controlador?acao=cadastrar-pessoas-form'">
            CADASTRAR NOVO
        </button>
    </body>
</html>