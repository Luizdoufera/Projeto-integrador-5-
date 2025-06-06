package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica() {}

    // Getter e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
