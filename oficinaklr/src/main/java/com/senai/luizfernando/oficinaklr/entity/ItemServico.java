package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ItemServico {
    @Id @GeneratedValue
    private Long id;

    private String descricao;
    private BigDecimal preco;

    @ManyToOne
    private Funcionario responsavel;

    @ManyToOne
    private OrdemDeServico ordemDeServico;
}

