package ContruirForma;

import forma.InterfaceForma;

public abstract class Contrucao {

    protected InterfaceForma forma;

    public Contrucao(InterfaceForma forma) {
        this.forma = forma;
    }

    public abstract void aplicarCor();

    public abstract void infoContrucao();
}
