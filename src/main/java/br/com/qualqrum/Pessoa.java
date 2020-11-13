package br.com.qualqrum;

import java.io.Serializable;

/**
 * Essa classe representa uma Pessoa.
 *
 * @author Wesley Inacio
 *
 */
class Pessoa implements Serializable {

    private String nome;
    private String email;
    private String telefone;
    private String celular;
    private Endereco endereco;

    public Pessoa(String nome, String email, String telefone, String celular, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.endereco = endereco;
    }

    public Pessoa(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.telefone = pessoa.getTelefone();
        this.celular = pessoa.getCelular();
        this.endereco = pessoa.getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
