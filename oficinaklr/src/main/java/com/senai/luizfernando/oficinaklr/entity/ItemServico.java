package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class ItemServico {
    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private BigDecimal preco;

    @ManyToOne
    private Funcionario responsavel;

    @ManyToOne
    private OrdemDeServico ordemDeServico;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public Funcionario getResponsavel() { return responsavel; }
    public void setResponsavel(Funcionario responsavel) { this.responsavel = responsavel; }

    public OrdemDeServico getOrdemDeServico() { return ordemDeServico; }
    public void setOrdemDeServico(OrdemDeServico ordemDeServico) { this.ordemDeServico = ordemDeServico; }
}
