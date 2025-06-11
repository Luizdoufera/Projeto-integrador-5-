package com.senai.luizfernando.oficinaklr.service;

import com.senai.luizfernando.oficinaklr.entity.Peca;
import com.senai.luizfernando.oficinaklr.repository.PecaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PecaService {

    private final PecaRepository pecaRepository;

    public PecaService(PecaRepository pecaRepository) {
        this.pecaRepository = pecaRepository;
    }

    public Peca cadastrarPeca(Peca peca) {
        return pecaRepository.save(peca);
    }

    public List<Peca> listarTodas() {
        return pecaRepository.findAll();
    }

    public Optional<Peca> buscarPorId(Long id) {
        return pecaRepository.findById(id);
    }

    public void deletarPeca(Long id) {
        pecaRepository.deleteById(id);
    }

    public Peca atualizarPeca(Long id, Peca novaPeca) {
        return pecaRepository.findById(id)
                .map(p -> {
                    p.setNome(novaPeca.getNome());
                    p.setDescricao(novaPeca.getDescricao());
                    p.setQuantidadeEstoque(novaPeca.getQuantidadeEstoque());
                    p.setPrecoUnitario(novaPeca.getPrecoUnitario());
                    return pecaRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Peça não encontrada"));
    }
}
