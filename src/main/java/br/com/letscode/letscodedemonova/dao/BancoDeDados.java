package br.com.letscode.letscodedemonova.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.letscode.letscodedemonova.modelo.Pessoa;

public class BancoDeDados {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public void salvar(Pessoa pessoa) {
        BancoDeDados.pessoas.add(pessoa);
    }

    public List<Pessoa> listar() {
        return BancoDeDados.pessoas;
    }

}
