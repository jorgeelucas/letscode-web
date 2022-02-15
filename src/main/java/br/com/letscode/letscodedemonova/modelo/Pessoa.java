package br.com.letscode.letscodedemonova.modelo;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String idade;
    private String data;

    public Pessoa(String nome, String sobrenome, String idade,
                  String data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.data = data;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public String getData() {
        return data;
    }
}
