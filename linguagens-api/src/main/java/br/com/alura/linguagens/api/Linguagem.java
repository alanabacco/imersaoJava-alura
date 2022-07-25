package br.com.alura.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "linguagens")
public class Linguagem {

  @Id
  private String Id;
  private String nome;
  private String imagem;
  private int classificacao;

  public Linguagem() {
  }

  public Linguagem(String nome, String imagem, int classificacao) {
    this.nome = nome;
    this.imagem = imagem;
    this.classificacao = classificacao;
  }

  public String getNome() {
    return nome;
  }

  public String getImagem() {
    return imagem;
  }

  public int getClassificacao() {
    return classificacao;
  }

}
