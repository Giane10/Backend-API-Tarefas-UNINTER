package com.uninter.apitarefas.controller;

import com.uninter.apitarefas.model.Tarefa;
import com.uninter.apitarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// CONCEITO: @RestController indica que a classe é um Controller REST e o retorno dos métodos é o próprio dado (JSON).
@RestController 
// CONCEITO: Define a URL base para todos os endpoints deste Controller.
@RequestMapping("/api/tarefas") 
public class TarefaController {

    // CONCEITO: Injeção de Dependência (@Autowired). O Spring cria a instância do TarefaRepository e entrega aqui.
    @Autowired 
    private TarefaRepository repository;

    // 1. ENDPOINT: Criar Tarefa (Requisito: POST)
    @PostMapping
    // @RequestBody mapeia o JSON que chega na requisição para o objeto Tarefa.
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        // Usa o método save() herdado do JpaRepository para inserir no banco.
        return repository.save(tarefa); 
    }

    // 2. ENDPOINT: Listar Todas (Requisito: GET)
    @GetMapping
    public List<Tarefa> listarTodas() {
        // Usa o método findAll() herdado do JpaRepository para buscar todas as tarefas.
        return repository.findAll(); 
    }
    
    // 3. ENDPOINT: Consultar por ID (Requisito: GET /api/tarefas/{id})
    // @PathVariable mapeia o ID que vem na URL (/1, /2, etc.) para o parâmetro 'id'.
    @GetMapping("/{id}")
    public Optional<Tarefa> consultarPorId(@PathVariable Long id) {
        return repository.findById(id); 
    }

    // 4. ENDPOINT: Atualizar Tarefa (Requisito: PUT /api/tarefas/{id})
    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        // Tenta encontrar a tarefa no banco pelo ID e, se encontrar, atualiza os campos e salva.
        return repository.findById(id).map(tarefa -> {
            tarefa.setNome(tarefaAtualizada.getNome());
            tarefa.setDataEntrega(tarefaAtualizada.getDataEntrega());
            tarefa.setResponsavel(tarefaAtualizada.getResponsavel());
            return repository.save(tarefa); // Salva a tarefa atualizada no banco
        }).orElseGet(() -> {
            // Se o ID não existir, ele salva como uma nova tarefa com o ID fornecido (padrão REST).
            tarefaAtualizada.setId(id);
            return repository.save(tarefaAtualizada);
        });
    }

    // 5. ENDPOINT: Remover Tarefa (Requisito: DELETE /api/tarefas/{id})
    @DeleteMapping("/{id}")
    public void removerTarefa(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
