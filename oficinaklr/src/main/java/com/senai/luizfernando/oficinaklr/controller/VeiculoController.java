package com.senai.luizfernando.oficinaklr.controller;

import com.senai.luizfernando.oficinaklr.entity.Veiculo;
import com.senai.luizfernando.oficinaklr.service.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping
    public ResponseEntity<Veiculo> cadastrarVeiculo(@RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(veiculoService.salvar(veiculo));
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listarTodos() {
        return ResponseEntity.ok(veiculoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        veiculoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
