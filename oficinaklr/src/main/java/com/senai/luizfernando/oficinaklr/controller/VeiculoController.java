package com.senai.luizfernando.oficinaklr.controller;

import com.senai.luizfernando.oficinaklr.dto.VeiculoDTO;
import com.senai.luizfernando.oficinaklr.entity.Veiculo;
import com.senai.luizfernando.oficinaklr.service.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping
    public ResponseEntity<Veiculo> cadastrar(@RequestBody VeiculoDTO dto) {
        return ResponseEntity.ok(veiculoService.cadastrarVeiculo(dto));
    }
}

