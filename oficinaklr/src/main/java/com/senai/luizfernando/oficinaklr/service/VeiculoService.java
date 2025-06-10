package com.senai.luizfernando.oficinaklr.service;

import com.senai.luizfernando.oficinaklr.dto.VeiculoDTO;
import com.senai.luizfernando.oficinaklr.entity.Cliente;
import com.senai.luizfernando.oficinaklr.entity.Veiculo;
import com.senai.luizfernando.oficinaklr.repository.ClienteRepository;
import com.senai.luizfernando.oficinaklr.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    private final ClienteRepository clienteRepository;

    public VeiculoService(VeiculoRepository veiculoRepository, ClienteRepository clienteRepository) {
        this.veiculoRepository = veiculoRepository;
        this.clienteRepository = clienteRepository;
    }

    public Veiculo cadastrarVeiculo(VeiculoDTO dto) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(dto.getClienteId());

        if (clienteOpt.isEmpty()) {
            throw new IllegalArgumentException("Cliente não encontrado com ID: " + dto.getClienteId());
        }

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(dto.getPlaca());
        veiculo.setMarca(dto.getMarca());
        veiculo.setModelo(dto.getModelo());
        veiculo.setCor(dto.getCor());
        veiculo.setAno(dto.getAno());
        veiculo.setCliente(clienteOpt.get());

        return veiculoRepository.save(veiculo);
    }
}
