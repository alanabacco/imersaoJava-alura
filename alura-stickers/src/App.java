import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // String url = "https://imersaojava-linguagens-api.herokuapp.com/linguagens";
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2024-01-31&end_date=2024-02-02";

        // ExtratorDeConteudo extrator = new ExtratorDeConteudoDoImdb();
        // ExtratorDeConteudo extrator = new ExtratorDeConteudoDasLinguagens(); // do projeto linguagens-api
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {
            Conteudo conteudo = conteudos.get(i);
            var titulo = conteudo.getTitulo();
            var tituloSemEspacos = titulo.replaceAll("[:\\s]", "");

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            // String nomeArquivo = "saida/" + tituloSemEspacos + ".png";
            String caminhoSaida = "C:\\Users\\alana\\repos\\imersaoJava-alura\\alura-stickers\\saida\\";
            String nomeArquivo = caminhoSaida + tituloSemEspacos + ".png";

            geradora.cria(inputStream, nomeArquivo, titulo);
            System.out.println(titulo);
        }
    }
}
