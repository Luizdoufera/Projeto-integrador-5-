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
}
