package com.senai.luizfernando.oficinaklr.service;

import com.senai.luizfernando.oficinaklr.entity.Veiculo;
import com.senai.luizfernando.oficinaklr.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    public void deletar(Long id) {
        veiculoRepository.deleteById(id);
    }
}


