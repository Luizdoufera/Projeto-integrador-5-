package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Cliente {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    // Construtor vazio
    public Cliente() {}

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}


