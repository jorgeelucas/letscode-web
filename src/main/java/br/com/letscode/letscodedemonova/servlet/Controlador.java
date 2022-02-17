package br.com.letscode.letscodedemonova.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controlador")
public class Controlador extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acao = req.getParameter("acao");

        String path = null;

        if (acao.equals("cadastrar-pessoas")) {
//            CadastrarPessoas cadastrarPessoas = new CadastrarPessoas(req, resp);
//            path = cadastrarPessoas.executar();
        } else if(acao.equals("listar-pessoas")) {
//            ListarPessoas listarPessoas = new ListarPessoas(req, resp);
//            path = listarPessoas.executar();
        } else if(acao.equals("remover-pessoas")) {
            // implementar
        } else if(acao.equals("alterar-pessoas")) {
            // implementar
        } else if(acao.equals("cadastrar-pessoas-form")) {
//            CadastrarPessoasForm form = new CadastrarPessoasForm();
//            path = form.executar();
        }

        String[] metodoECaminho = path.split(":");
        if (metodoECaminho[0].equals("forward")) {
            req.getRequestDispatcher("/WEB-INF/view/"+metodoECaminho[1])
                .forward(req, resp);
        } else if(metodoECaminho[0].equals("redirect")){
            resp.sendRedirect(metodoECaminho[1]);
        }

    }

}
