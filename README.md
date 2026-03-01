# Sistema de Web Services com Spring Boot

API REST desenvolvida em Java utilizando Spring Boot, JPA e Hibernate.  
O sistema gerencia usuários, pedidos, produtos e categorias, seguindo arquitetura em camadas.

---

## 📌 Objetivo

- Criar uma API REST com Spring Boot  
- Implementar modelo de domínio relacional  
- Aplicar arquitetura em camadas (Resource, Service, Repository)  
- Configurar banco de dados para teste e desenvolvimento  
- Implementar operações CRUD  
- Aplicar tratamento de exceções  

---

## 🚀 Funcionalidades

- CRUD completo para:
  - User
  - Order
  - Product
  - Category
  - OrderItem
- Relacionamentos:
  - One-to-Many  
  - Many-to-Many  
  - One-to-One  
- Enum para status do pedido  
- Seed automático no perfil de teste  
- Tratamento de exceções personalizado  
- Respostas em JSON  

---

## 🏗️ Arquitetura

resource → Controladores REST
service → Regras de negócio
repository → Acesso aos dados (JPA)
entities → Modelo de domínio

---

## 🛠️ Tecnologias

- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- H2 Database  
- PostgreSQL  
- Maven  

---

## ⚙️ Perfis

### 🔹 Teste
- H2 em memória  
- Console H2 habilitado  
- Dados iniciais automáticos  

### 🔹 Desenvolvimento
- PostgreSQL local  
- Atualização automática do schema  

---
