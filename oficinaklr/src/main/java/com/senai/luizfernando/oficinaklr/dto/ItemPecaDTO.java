package com.senai.luizfernando.oficinaklr.dto;

import java.math.BigDecimal;

public class ItemPecaDTO {
    private Long pecaId;
    private int quantidade;
    private BigDecimal precoUnitario;

    public Long getPecaId() { return pecaId; }
    public void setPecaId(Long pecaId) { this.pecaId = pecaId; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public BigDecimal getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(BigDecimal precoUnitario) { this.precoUnitario = precoUnitario; }
}
