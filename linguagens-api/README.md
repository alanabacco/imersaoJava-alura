# Linguagens API - IMERSÃO JAVA

## 💻 Sobre o projeto

Este projeto consiste em uma API voltada para o cadastro e listagem de linguagens de programação, empregando o framework Spring Boot em conjunto com o MongoDB como banco de dados.

<figure align="center">
  <img alt="Gif de apresentação do projeto Linguagens API" src="../linguagens-api.gif">
  <figcaption>Gif de apresentação do projeto Linguagens API</figcaption>
</figure>

## 🛠 Ferramentas e tecnologias utilizadas

- [Java](https://www.alura.com.br/artigos/java)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MongoDb](https://www.mongodb.com/pt-br)
- [VS Code](https://code.visualstudio.com/)

<br/>

- [Logos das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos)

## 📝 Anotações

- [spring initializr](https://start.spring.io/) - você escolhe as dependências iniciais e ele gera um zip com o projeto inicial;
- [Spring Boot](https://spring.io/projects/spring-boot) - "Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".";
- Maven - ferramenta de build do Java;
  - instalando o Maven:
    - https://maven.apache.org/install.html
    - https://dicasdeprogramacao.com.br/como-instalar-o-maven-no-windows/
- Arquivo pom.xml - um XML do que tem no projeto;

<br/>

- Pra fazer deploy no [fly.io](https://fly.io/):
  - tem que criar uma imagem Docker;
    - no VS Code com a extensão do Docker, ctrl+shift+p > dockerfile > criar um docker file do Java > verificar informações (como versão do jdk);
    - depois de criado o file, fazer o build, ctrl+shift+p > docker image build image > nome da imagem > vai construir a imagem;
  - Subir a imagem no Docker Hub (tem como fazer pelo próprio VS Code);
  - Seguir os passos em: https://fly.io/docs/hands-on/install-flyctl/ e os próximos;

---

Desenvolvido por [Alana Bacco](https://github.com/alanabacco). <br />
[![Linkedin Badge](https://img.shields.io/badge/-Linkedin-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/alana-bacco/)](https://www.linkedin.com/in/alana-bacco/)
