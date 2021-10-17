# gubee-tech

# Sobre o projeto
Esse projeto foi desenvolvido para atender ao processo seletivo para desenvolvedor java na Gubee tecnologia. Ele consiste em uma camada de serviço backend 
desenvolvido com Java e Spring no modelo rest que filtra os produtos da empresa pelas tecnologias selecionadas através de requisições e envia para o front-end. No front-end
foi utilizado JavaScript com a biblioteca React para mostrar o retorno das requisições com os produtos equivalentes

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Front end
- JavaScript
- React
- Axios

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/Michelosc/gubee-tech

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run

#empacotar o projeto
./mvnw clean package
```

## Front end
Pré-requisitos: NodeJs

```bash
# clonar repositório
git clone https://github.com/Michelosc/gubee-tech

# entrar na pasta do projeto front end
cd frontend/gub-tech

# instalar as dependências
npm install

# executar o projeto
npm start
```
# Endpoints
Listar Produtos
- GET localhost:8080/produtos

Filtrar por tecnologia
- GET localhost:8080/produtos/"tecnologia escolhida"

# Autor

Michel Corrêa

https://www.linkedin.com/in/
