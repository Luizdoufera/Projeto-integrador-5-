package com.senai.luizfernando.oficinaklr.controller;

import com.senai.luizfernando.oficinaklr.entity.Peca;
import com.senai.luizfernando.oficinaklr.service.PecaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pecas")
public class PecaController {

    private final PecaService pecaService;

    public PecaController(PecaService pecaService) {
        this.pecaService = pecaService;
    }

    @PostMapping
    public ResponseEntity<Peca> cadastrar(@RequestBody Peca peca) {
        return ResponseEntity.ok(pecaService.cadastrarPeca(peca));
    }

    @GetMapping
    public ResponseEntity<List<Peca>> listarTodas() {
        return ResponseEntity.ok(pecaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Peca> buscarPorId(@PathVariable Long id) {
        return pecaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Peca> atualizar(@PathVariable Long id, @RequestBody Peca peca) {
        return ResponseEntity.ok(pecaService.atualizarPeca(id, peca));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        pecaService.deletarPeca(id);
        return ResponseEntity.noContent().build();
    }
}
