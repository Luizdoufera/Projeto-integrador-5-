package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.Entity;

@Entity
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica() {}

    // Getter e Setter
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
