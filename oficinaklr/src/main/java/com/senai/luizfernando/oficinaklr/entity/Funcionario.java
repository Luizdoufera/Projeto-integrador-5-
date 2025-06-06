package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cargo;
    private String telefone;
    private String email;
}
