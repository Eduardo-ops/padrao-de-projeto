package ContruirForma;

import forma.InterfaceForma;

public class Vermelho extends Contrucao {

    public Vermelho(InterfaceForma forma) {
        super(forma);
    }

    @Override
    public void aplicarCor() {
        this.forma.setColor("Vermelho");
    }

    @Override
    public void infoContrucao() {
        System.out.println("Forma: " + this.forma.getName());
        System.out.println("Cor aplicada: " + this.forma.getColor());
    }
}
