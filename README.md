# 💻 Backend API de Gerenciamento de Tarefas (Trabalho Prático UNINTER)

Este repositório contém a solução para a Atividade Prática de Desenvolvimento Web Back-end. Trata-se de uma API RESTful completa para gerenciamento de tarefas, implementada seguindo os padrões CRUD (Create, Read, Update, Delete) e utilizando as tecnologias do ecossistema Spring.

## 🧑‍🎓 Dados do Aluno

* **Aluno:** Giane
* **RU:** 46881...
* **Disciplina:** Desenvolvimento Web Back-end

---

## 🚀 Tecnologias Utilizadas

O projeto foi construído com foco na persistência de dados e na criação de uma API robusta:

* **Linguagem:** Java 17
* **Framework:** Spring Boot (Versão Estável Mais Recente)
* **Persistência:** Spring Data JPA (com Hibernate)
* **Banco de Dados:** MySQL (configurado localmente)
* **Gerenciador de Dependências:** Apache Maven

---

## ⚙️ Configuração e Execução

Para rodar esta aplicação localmente, é necessário ter o **JDK 17** e o **MySQL Server** instalados.

### 1. Configuração do Banco de Dados

O Spring Boot foi configurado para se conectar ao MySQL. O arquivo `application.properties` contém as seguintes configurações (que devem ser ajustadas localmente):

* **Nome do Banco:** `db_tarefas`
* **Usuário:** `root`
* **Senha:** `[Sua senha deve ser inserida aqui]` *(**Nota de Segurança:** A senha real do MySQL foi substituída por um placeholder neste repositório por questões de segurança.)*
* **Porta do Servidor:** 8082 (`server.port=8082`)

**Ação:** Antes de rodar, ajuste o valor `spring.datasource.password` no seu `application.properties` local com sua senha real.

### 2. Rodar a Aplicação

1.  Importe o projeto como **Existing Maven Project** no Eclipse (ou IntelliJ).
2.  Inicie o servidor MySQL.
3.  Execute a classe principal: `ApiTarefasApplication.java`.
4.  O servidor Tomcat será iniciado na porta **8082**.

---

## 📌 Endpoints da API (CRUD)

A API RESTful implementa todos os requisitos funcionais no `TarefaController` sob o endpoint base: `http://localhost:8082/api/tarefas`.

| Funcionalidade | Método HTTP | URL | Descrição |
| :--- | :--- | :--- | :--- |
| **Criar Tarefa** | `POST` | `/api/tarefas` | Insere um novo registro de tarefa. |
| **Consultar Todas** | `GET` | `/api/tarefas` | Retorna a lista completa de tarefas. |
| **Consultar por ID** | `GET` | `/api/tarefas/{id}` | Retorna uma tarefa específica. |
| **Atualizar Tarefa**| `PUT` | `/api/tarefas/{id}` | Modifica os dados de uma tarefa existente. |
| **Remover Tarefa** | `DELETE` | `/api/tarefas/{id}` | Exclui o registro do banco de dados. |

---

## ✅ Comprovação da Atividade (Testes Postman)

Todos os endpoints acima foram testados e documentados com sucesso utilizando o Postman, conforme as evidências anexadas ao Caderno de Atividades e Respostas.

O registro obrigatório de teste (**Desenvolvimento da API**) foi criado com o identificador: **`Giane46881..`**.

[// Opcional: Adicione aqui uma imagem de um dos seus testes do Postman]
