# Atividade de DAC multidatabase

Este projeto demonstra a implementação de uma API Java com Spring Boot capaz de realizar persistência simultânea em dois bancos de dados: **PostgreSQL** e **MongoDB**.

## Tecnologias
* **Java 21**
* **Spring Boot 4.0.5**
* **Spring Data JPA** (PostgreSQL)
* **Spring Data MongoDB** (MongoDB)
* **Docker & Docker Compose**

## Instruções para Execução

### 1. Subir os Bancos de Dados (Docker)
A aplicação depende de instâncias do PostgreSQL e MongoDB. No terminal na raiz do projeto, execute o comando:

docker-compose up -d

## Instruções para Testar

Inicie a aplicação através da sua IDE executando a classe MultidatabaseApplication.java.

Pelo **Insonia** ou **Postman** no metodo **POST**, coloque a URL **http://localhost:8080/dados**
No Body (JSON) coloque o texto:
{
  "code": "A1",
  "text": "Teste",
  "confirmed": true
}

## Intruções para verificar os dados no BD
Entre no aplicativo do Docker Desktop.

### 1. No terminal do Postgres do Docker Desktop
Utilize os comandos:
**docker exec -it <nome_do_container_postgres>**

**psql -U usuario -d atividadedb -c "SELECT * FROM tb_data;"**

### 2. No terminal do MongoDB do Docker Desktop
Utilize os comandos: 

**docker exec -it <nome_do_container_mongo>**

**mongosh**

**use atividadedb**

**db.TbData.find().pretty()**
