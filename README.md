# CRUD
CRUD de Usuários - Java + Spring Boot

Este projeto é um CRUD (Create, Read, Update, Delete) desenvolvido em Java com Spring Boot, utilizando Spring Data JPA e banco de dados H2 em memória.
O objetivo é praticar conceitos de desenvolvimento backend, APIs REST e persistência de dados.

---

🚀 Tecnologias utilizadas

- Java 17+

- Spring Boot

- Spring Data JPA

- H2 Database

- Lombok

- Postman (para testes dos endpoints)

---

⚙️ Funcionalidades

Create (POST) → Cadastrar um novo usuário

Read (GET) → Buscar usuário pelo e-mail

Update (PUT) → Atualizar informações de um usuário existente

Delete (DELETE) → Excluir usuário a partir do e-mail

---

🗂 Estrutura do projeto

entities/ → Representação das tabelas no banco (User)

repositories/ → Interfaces de acesso ao banco via JPA

business/ → Lógica de negócio (UserService)

controller/ → Endpoints da API REST (UserController)

---

📖 Aprendizados

Estrutura de um projeto Spring Boot (Entity, Repository, Service, Controller)

Mapeamento de entidades com JPA/Hibernate

Uso do H2 Database em memória

Testes de endpoints com Postman

Boas práticas de organização de código e versionamento no GitHub
