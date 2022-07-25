import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // fazer uma conexão http e buscar os filmes

        // String url = "https://alura-filmes.herokuapp.com/conteudos"; // api disponibilizada pela instrutora Jacqueline Oliveira
        // ExtratorDeConteudo extrator = new ExtratorDeConteudoDoImdb();

        String url = "https://imersaojava-linguagens-api.herokuapp.com/linguagens";
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDasLinguagens(); // do projeto linguagens-api

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        
        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {
            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);
            System.out.println(conteudo.getTitulo());
        }
    }
}
