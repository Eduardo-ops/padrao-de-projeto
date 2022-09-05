public class PizzaMG extends Pizza {

    public PizzaMG() {

    }

    public PizzaMG(PizzaMG pizzaMG) {
        this.nome = pizzaMG.getNome();
        this.sabor = pizzaMG.getSabor();
        this.tamanho = pizzaMG.getTamanho();
    }

    public String informacoesDePizzaMG() {
        System.out.println("Pizza MG: " + this.nome + " | sabor: " + this.sabor + " | tamanho: " + this.tamanho);
        return null;
    }

    @Override
    public Pizza clone() {
        return new PizzaMG(this);
    }
}
