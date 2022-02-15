package br.com.letscode.letscodedemonova.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.letscode.letscodedemonova.dao.BancoDeDados;
import br.com.letscode.letscodedemonova.modelo.Pessoa;

@WebServlet(name = "cadastro", value = "/cadastro")
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String idade = req.getParameter("idade");
        String data = req.getParameter("data");

        Pessoa pessoaModelo = new Pessoa(nome, sobrenome, idade, data);

        BancoDeDados bd = new BancoDeDados();
        bd.salvar(pessoaModelo);

//        resp.setContentType("text/html");
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("página de cadastro acessada");
//        for (Pessoa pessoa : bd.listar()) {
//            writer.println("<ul>");
//            writer.println("<li>nome: " + pessoa.getNome() + "</li>");
//            writer.println("<li>sobrenome: " + pessoa.getSobrenome() + "</li>");
//            writer.println("<li>idade: " + pessoa.getIdade() + "</li>");
//            writer.println("<li>data: " + pessoa.getData() + "</li>");
//            writer.println("</ul>");
//        }

        List<Pessoa> pessoas = bd.listar();

        req.setAttribute("pessoas", pessoas);
        req.setAttribute("titulo", "Listagem de pessoas");

        req.getRequestDispatcher("WEB-INF/lista-pessoas.jsp")
            .forward(req, resp);

    }
}
