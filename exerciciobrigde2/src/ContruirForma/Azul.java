package ContruirForma;

import forma.InterfaceForma;

public class Azul extends Contrucao {

    public Azul(InterfaceForma forma) {
        super(forma);
    }

    @Override
    public void aplicarCor() {
        this.forma.setColor("Azul");
    }

    @Override
    public void infoContrucao() {
        System.out.println("Forma: " + this.forma.getName());
        System.out.println("Cor aplicada: " + this.forma.getColor());
    }
}
