package com.senai.luizfernando.oficinaklr.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class OrdemDeServicoDTO {
    private Long veiculoId;
    private List<ItemServicoDTO> servicos;
    private List<ItemPecaDTO> pecas;
    private String status;

    // Getters e Setters
    public Long getVeiculoId() { return veiculoId; }
    public void setVeiculoId(Long veiculoId) { this.veiculoId = veiculoId; }

    public List<ItemServicoDTO> getServicos() { return servicos; }
    public void setServicos(List<ItemServicoDTO> servicos) { this.servicos = servicos; }

    public List<ItemPecaDTO> getPecas() { return pecas; }
    public void setPecas(List<ItemPecaDTO> pecas) { this.pecas = pecas; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}