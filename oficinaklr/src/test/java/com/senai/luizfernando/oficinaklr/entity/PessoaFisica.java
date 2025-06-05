package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class PessoaFisica extends Cliente {
    private String cpf;
    private LocalDate dataNascimento;
}
