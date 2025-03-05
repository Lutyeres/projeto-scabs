package com.lutysoft.scabs.modelo.dominio;

public class faccao {
    //Atributos da classe faccao de acordo com o banco de dados.
    private Long id;
    private String nome;
    //Construtor vazio
    public faccao() {
    }
    //Construtor que permite a modificar os atributos.
    public faccao(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    //Método para pegar o atributo ID.
    public Long getId() {
        return id;
    }
    //Método para pegar o atributo Nome.
    public String getNome() {
        return nome;
    }
    //Método para definir o ID.
    public void setId(Long id) {
        this.id = id;
    }
    //Método para definir o Nome.
    public void setNome(String nome) {
        this.nome = nome;
    }

}
