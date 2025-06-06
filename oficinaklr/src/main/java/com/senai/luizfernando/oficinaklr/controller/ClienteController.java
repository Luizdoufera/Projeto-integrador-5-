package com.senai.luizfernando.oficinaklr.controller;

import com.senai.luizfernando.oficinaklr.entity.PessoaFisica;
import com.senai.luizfernando.oficinaklr.entity.PessoaJuridica;
import com.senai.luizfernando.oficinaklr.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/pf")
    public ResponseEntity<PessoaFisica> cadastrarPessoaFisica(@RequestBody PessoaFisica pf) {
        return ResponseEntity.ok((PessoaFisica) clienteService.salvar(pf));
    }

    @PostMapping("/pj")
    public ResponseEntity<PessoaJuridica> cadastrarPessoaJuridica(@RequestBody PessoaJuridica pj) {
        return ResponseEntity.ok((PessoaJuridica) clienteService.salvar(pj));
    }
}
