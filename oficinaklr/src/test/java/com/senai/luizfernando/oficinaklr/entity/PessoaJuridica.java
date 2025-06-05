package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;
}
