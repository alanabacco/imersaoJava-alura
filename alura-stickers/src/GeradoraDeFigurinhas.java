import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

  // método
  public void cria(InputStream inputStream, String nomeArquivo, String frase) throws Exception {

    // leitura da imagem
    BufferedImage imagemOriginal = ImageIO.read(inputStream);

    // cria nova imagem com transparencia e tamanho novo
    int largura = imagemOriginal.getWidth();
    int altura = imagemOriginal.getHeight();
    int novaAltura = altura + 200;
    BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

    // copiar a imagem original pra nova imagem (em memória)
    Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
    graphics.drawImage(imagemOriginal, 0, 0, null);

    // configurar a fonte
    var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 40);
    graphics.setColor(Color.YELLOW);
    graphics.setFont(fonte);

    int textoLargura = graphics.getFontMetrics().stringWidth(frase);
    int x = (largura - textoLargura) / 2; // centralizar horizontalmente

    // esrever uma frase na nova imagem
    // graphics.drawString("TOPZERA", 100, novaAltura - 100);
    graphics.drawString(frase, x, novaAltura - 100);

    // escrever a nova imagem em um arquivo
    ImageIO.write(novaImagem, "png", new File(nomeArquivo));
  }
}
