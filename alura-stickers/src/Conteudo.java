public class Conteudo {

  // final significa que ninguém vai conseguir mudar depois de criado
  private final String titulo;
  private final String urlImagem;

  // construtor
  public Conteudo(String titulo, String urlImagem) {
    this.titulo = titulo;
    this.urlImagem = urlImagem;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getUrlImagem() {
    return urlImagem;
  }

}
