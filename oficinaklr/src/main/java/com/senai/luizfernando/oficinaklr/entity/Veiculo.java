package com.senai.luizfernando.oficinaklr.entity;

import jakarta.persistence.*;

@Entity
public class Veiculo {
    @Id @GeneratedValue
    private Long id;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    @ManyToOne
    private Cliente proprietario;
}

