// OrdemDeServicoService.java
package com.senai.luizfernando.oficinaklr.service;

import com.senai.luizfernando.oficinaklr.dto.*;
import com.senai.luizfernando.oficinaklr.entity.*;
import com.senai.luizfernando.oficinaklr.repository.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdemDeServicoService {

    private final OrdemDeServicoRepository osRepo;
    private final ItemServicoRepository itemServicoRepo;
    private final ItemPecaRepository itemPecaRepo;
    private final FuncionarioRepository funcionarioRepo;
    private final PecaRepository pecaRepo;
    private final VeiculoRepository veiculoRepo;

    public OrdemDeServicoService(
            OrdemDeServicoRepository osRepo,
            ItemServicoRepository itemServicoRepo,
            ItemPecaRepository itemPecaRepo,
            FuncionarioRepository funcionarioRepo,
            PecaRepository pecaRepo,
            VeiculoRepository veiculoRepo
    ) {
        this.osRepo = osRepo;
        this.itemServicoRepo = itemServicoRepo;
        this.itemPecaRepo = itemPecaRepo;
        this.funcionarioRepo = funcionarioRepo;
        this.pecaRepo = pecaRepo;
        this.veiculoRepo = veiculoRepo;
    }

    public OrdemDeServico cadastrarOrdem(OrdemDeServicoDTO dto) {
        OrdemDeServico os = new OrdemDeServico();
        os.setDataAbertura(LocalDate.now());
        os.setStatus(dto.getStatus());

        Veiculo veiculo = veiculoRepo.findById(dto.getVeiculoId())
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
        os.setVeiculo(veiculo);

        List<ItemServico> servicos = new ArrayList<>();
        BigDecimal total = BigDecimal.ZERO;

        for (ItemServicoDTO s : dto.getServicos()) {
            Funcionario f = funcionarioRepo.findById(s.getResponsavelId())
                    .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

            ItemServico item = new ItemServico();
            item.setDescricao(s.getDescricao());
            item.setPreco(s.getPreco());
            item.setResponsavel(f);
            item.setOrdemDeServico(os);

            servicos.add(item);
            total = total.add(s.getPreco());
        }

        List<ItemPeca> pecas = new ArrayList<>();
        for (ItemPecaDTO p : dto.getPecas()) {
            Peca peca = pecaRepo.findById(p.getPecaId())
                    .orElseThrow(() -> new RuntimeException("Peça não encontrada"));

            ItemPeca item = new ItemPeca();
            item.setPeca(peca);
            item.setPrecoUnitario(p.getPrecoUnitario());
            item.setQuantidade(p.getQuantidade());
            item.setOrdemDeServico(os);

            pecas.add(item);
            total = total.add(p.getPrecoUnitario().multiply(BigDecimal.valueOf(p.getQuantidade())));
        }

        os.setValorTotal(total);
        os.setServicos(servicos);
        os.setPecas(pecas);

        return osRepo.save(os);
    }

    public List<OrdemDeServico> listarTodas() {
        return osRepo.findAll();
    }
}
