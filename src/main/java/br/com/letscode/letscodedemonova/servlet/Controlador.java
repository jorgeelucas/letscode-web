package br.com.letscode.letscodedemonova.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.letscode.letscodedemonova.dao.BancoDeDados;
import br.com.letscode.letscodedemonova.modelo.Pessoa;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");

        if (acao.equals("cadastrar-pessoas")) {
            String nome = req.getParameter("nome");
            String sobrenome = req.getParameter("sobrenome");
            String idade = req.getParameter("idade");
            String data = req.getParameter("data");

            Pessoa pessoa = new Pessoa(nome, sobrenome, idade, data);

            BancoDeDados bd = new BancoDeDados();
            bd.salvar(pessoa);

            resp.sendRedirect("/app/controlador?acao=listar-pessoas");

        } else if(acao.equals("listar-pessoas")) {
            BancoDeDados bd = new BancoDeDados();
            List<Pessoa> pessoas = bd.listar();

            req.setAttribute("pessoas", pessoas);
            req.setAttribute("titulo", "Listagem de pessoas");

            req.getRequestDispatcher("/WEB-INF/lista-pessoas.jsp")
                .forward(req, resp);

        } else if(acao.equals("remover-pessoas")) {
            // implementar
        } else if(acao.equals("alterar-pessoas")) {
            // implementar
        } else if(acao.equals("cadastrar-pessoas-form")) {
            req.getRequestDispatcher("/WEB-INF/formulario.html")
                .forward(req, resp);
        }

    }

}
