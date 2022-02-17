package br.com.letscode.letscodedemonova.modelo.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.letscode.letscodedemonova.dao.BancoDeDados;
import br.com.letscode.letscodedemonova.modelo.Pessoa;

public class CadastrarPessoas {

    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public CadastrarPessoas(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
    }

    public String executar() {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String idade = req.getParameter("idade");
        String data = req.getParameter("data");

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, data);

        BancoDeDados bd = new BancoDeDados();
        bd.salvar(pessoa);

        return "redirect:/app/controlador?acao=listar-pessoas";
    }
}
