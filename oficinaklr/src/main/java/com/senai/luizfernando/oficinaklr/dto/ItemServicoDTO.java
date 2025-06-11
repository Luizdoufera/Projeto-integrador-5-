package com.senai.luizfernando.oficinaklr.dto;

import java.math.BigDecimal;

public class ItemServicoDTO {
    private String descricao;
    private BigDecimal preco;
    private Long responsavelId;

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public Long getResponsavelId() { return responsavelId; }
    public void setResponsavelId(Long responsavelId) { this.responsavelId = responsavelId; }
}