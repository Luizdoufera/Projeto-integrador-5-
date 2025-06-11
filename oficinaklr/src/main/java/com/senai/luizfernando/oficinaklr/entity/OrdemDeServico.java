package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class OrdemDeServico {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate dataAbertura;
    private LocalDate dataConclusao;
    private String status;
    private BigDecimal valorTotal;

    @ManyToOne
    private Veiculo veiculo;

    @OneToMany(mappedBy = "ordemDeServico", cascade = CascadeType.ALL)
    private List<ItemServico> servicos;

    @OneToMany(mappedBy = "ordemDeServico", cascade = CascadeType.ALL)
    private List<ItemPeca> pecas;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDataAbertura() { return dataAbertura; }
    public void setDataAbertura(LocalDate dataAbertura) { this.dataAbertura = dataAbertura; }

    public LocalDate getDataConclusao() { return dataConclusao; }
    public void setDataConclusao(LocalDate dataConclusao) { this.dataConclusao = dataConclusao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public BigDecimal getValorTotal() { return valorTotal; }
    public void setValorTotal(BigDecimal valorTotal) { this.valorTotal = valorTotal; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public List<ItemServico> getServicos() { return servicos; }
    public void setServicos(List<ItemServico> servicos) { this.servicos = servicos; }

    public List<ItemPeca> getPecas() { return pecas; }
    public void setPecas(List<ItemPeca> pecas) { this.pecas = pecas; }
}
