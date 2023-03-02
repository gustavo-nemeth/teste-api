package br.nemeth.apicadastro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Entity
public class Endereco  {
    @Id @GeneratedValue
    private long Id;
    private boolean primario;
    private String logradouro;
    private String numero;
    private String observacao;
    private String cep;
    private String cidade;
    private String siglaEstado;

    @ManyToOne
    private Pessoa pessoa;

    public Endereco() {
    }

    public Endereco(long id, boolean primario, String logradouro, String numero, String observacao, String cep, String cidade, String siglaEstado) {
        Id = id;
        this.primario = primario;
        this.logradouro = logradouro;
        this.numero = numero;
        this.observacao = observacao;
        this.cep = cep;
        this.cidade = cidade;
        this.siglaEstado = siglaEstado;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public boolean isPrimario() {
        return primario;
    }

    public void setPrimario(boolean primario) {
        this.primario = primario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
