package br.com.letscode.letscodedemonova.modelo.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.letscode.letscodedemonova.dao.BancoDeDados;
import br.com.letscode.letscodedemonova.modelo.Pessoa;

public class ListarPessoas {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public ListarPessoas(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }

    public String executar() {
        BancoDeDados bd = new BancoDeDados();
        List<Pessoa> pessoas = bd.listar();

        req.setAttribute("pessoas", pessoas);
        req.setAttribute("titulo", "Listagem de pessoas");

        return "forward:lista-pessoas.jsp";
    }
}
