package com.senai.luizfernando.oficinaklr.repository;

import com.senai.luizfernando.oficinaklr.entity.PessoaFisica;
import com.senai.luizfernando.oficinaklr.entity.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {}


