package com.uninter.apitarefas.model; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate; 

//A Tabela 'tarefa' será criada no MySQL
@Entity // Marca a classe como uma Entidade JPA (tabela no MySQL)
public class Tarefa {
	
    @Id // Marca 'id' como a Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Diz ao MySQL para gerar o ID automaticamente
    private Long id; 
    
    private String nome;
    private LocalDate dataEntrega;
    private String responsavel;

 // Construtor vazio (necessário para o JPA)
    public Tarefa() {
    }


    // --- GETTERS E SETTERS ---
    // Devem ser gerados automaticamente.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


}
