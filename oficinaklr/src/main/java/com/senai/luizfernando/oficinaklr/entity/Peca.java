package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Peca {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
    private int quantidadeEstoque;
    private BigDecimal precoUnitario;
}

