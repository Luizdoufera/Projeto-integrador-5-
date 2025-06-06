package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ItemPeca {
    @Id @GeneratedValue
    private Long id;

    private int quantidade;
    private BigDecimal precoUnitario;

    @ManyToOne
    private Peca peca;

    @ManyToOne
    private OrdemDeServico ordemDeServico;
}

