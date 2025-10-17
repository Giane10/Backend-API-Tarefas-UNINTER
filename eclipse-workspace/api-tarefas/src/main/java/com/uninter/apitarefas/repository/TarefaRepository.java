package com.uninter.apitarefas.repository;

import com.uninter.apitarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

// CONCEITO: JpaRepository herda o CRUD.
// <Tarefa> é a Entidade que ele irá manipular.
// <Long> é o tipo da Chave Primária (o ID).
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Essa interface está vazia, mas já contém os métodos save(), findAll(), findById(), etc.

}