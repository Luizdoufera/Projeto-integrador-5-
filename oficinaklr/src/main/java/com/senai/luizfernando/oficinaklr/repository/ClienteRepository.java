package com.senai.luizfernando.oficinaklr.repository;

import com.senai.luizfernando.oficinaklr.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
