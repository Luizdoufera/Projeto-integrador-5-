package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class    OrdemDeServico {
    @Id @GeneratedValue
    private Long id;
    private LocalDate dataAbertura;
    private LocalDate dataConclusao;
    private String status; // ABERTA, EM_EXECUCAO, CONCLUIDA, CANCELADA
    private BigDecimal valorTotal;

    @ManyToOne
    private Veiculo veiculo;

    @OneToMany(mappedBy = "ordemDeServico", cascade = CascadeType.ALL)
    private List<ItemServico> servicos;

    @OneToMany(mappedBy = "ordemDeServico", cascade = CascadeType.ALL)
    private List<ItemPeca> pecas;

}
