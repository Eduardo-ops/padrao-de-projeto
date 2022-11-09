import ContruirForma.Azul;
import ContruirForma.Vermelho;
import forma.Circulo;
import forma.Quadrado;

public class Client {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        Vermelho vermelho = new Vermelho(quadrado);

        quadrado.getName();
        vermelho.aplicarCor();
        vermelho.infoContrucao();

        Circulo circulo = new Circulo();
        Azul azul = new Azul(circulo);

        circulo.getName();
        azul.aplicarCor();
        azul.infoContrucao();
    }
}
