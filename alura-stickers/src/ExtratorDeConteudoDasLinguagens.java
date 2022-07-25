import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDasLinguagens implements ExtratorDeConteudo {
  public List<Conteudo> extraiConteudos(String json) {

    // extrair os dados que interessam
    JsonParser parser = new JsonParser();
    List<Map<String, String>> listaDeAtributos = parser.parse(json);

    List<Conteudo> conteudos = new ArrayList<>();

    // popular a lista de conteudos
    for (Map<String, String> atributos : listaDeAtributos) {
      String titulo = atributos.get("nome");
      String urlImagem = atributos.get("imagem");
      // String ranking = atributos.get("classificação");

      var conteudo = new Conteudo(titulo, urlImagem);

      conteudos.add(conteudo);
    }

    return conteudos;
  }
}
