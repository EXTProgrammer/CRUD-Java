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

---

✅ Demonstração

# Create
![Postman- criar usuário](https://github.com/EXTProgrammer/CRUD-Java/blob/main/postman_post.png)
![H2- criar usuário](https://github.com/EXTProgrammer/CRUD-Java/blob/main/h2_insert.png)

# Read
![Postman - leitura](https://github.com/EXTProgrammer/CRUD-Java/blob/main/postman_get.png)

# Update
![Postman - atualizar](https://github.com/EXTProgrammer/CRUD-Java/blob/main/postman_put.png)
![H2 - atualizar](https://github.com/EXTProgrammer/CRUD-Java/blob/main/h2_put.png)

# Delete
![Postman - deletar](https://github.com/EXTProgrammer/CRUD-Java/blob/main/postman_del.png)
![Postman - deletar](https://github.com/EXTProgrammer/CRUD-Java/blob/main/h2_del.png)
