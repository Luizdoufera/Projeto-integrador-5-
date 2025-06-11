// OrdemDeServicoController.java
package com.senai.luizfernando.oficinaklr.controller;

import com.senai.luizfernando.oficinaklr.dto.OrdemDeServicoDTO;
import com.senai.luizfernando.oficinaklr.entity.OrdemDeServico;
import com.senai.luizfernando.oficinaklr.service.OrdemDeServicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordens")
public class OrdemDeServicoController {

    private final OrdemDeServicoService service;

    public OrdemDeServicoController(OrdemDeServicoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OrdemDeServico> cadastrar(@RequestBody OrdemDeServicoDTO dto) {
        return ResponseEntity.ok(service.cadastrarOrdem(dto));
    }

    @GetMapping
    public ResponseEntity<List<OrdemDeServico>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }
}
