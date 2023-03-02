package br.nemeth.apicadastro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Pessoa {

    @Id @GeneratedValue
    private long Id;
    private String Nome;
    private Date Nascimento;

    @OneToMany
    private List<Endereco> enderecos;


    public Pessoa() {
    }

    public Pessoa(long id, String nome, Date nascimento, List<Endereco> enderecos) {
        Id = id;
        Nome = nome;
        Nascimento = nascimento;
        this.enderecos = enderecos;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date nascimento) {
        Nascimento = nascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
