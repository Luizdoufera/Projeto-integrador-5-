package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class ItemPeca {
    @Id
    @GeneratedValue
    private Long id;

    private int quantidade;
    private BigDecimal precoUnitario;

    @ManyToOne
    private Peca peca;

    @ManyToOne
    private OrdemDeServico ordemDeServico;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public BigDecimal getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(BigDecimal precoUnitario) { this.precoUnitario = precoUnitario; }

    public Peca getPeca() { return peca; }
    public void setPeca(Peca peca) { this.peca = peca; }

    public OrdemDeServico getOrdemDeServico() { return ordemDeServico; }
    public void setOrdemDeServico(OrdemDeServico ordemDeServico) { this.ordemDeServico = ordemDeServico; }
}
