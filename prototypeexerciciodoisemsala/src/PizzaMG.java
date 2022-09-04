public class PizzaMG extends Pizza {

    public PizzaMG() {

    }

    public PizzaMG(PizzaMG pizzaMg) {
        this.nome = pizzaMg.getNome();
        this.sabor = pizzaMg.getSabor();
        this.tamanho = pizzaMg.getTamanho();
    }

    public String informacoesDePizza() {
        System.out.println("Pizza MG: " + this.nome + " sabor: " + this.sabor + " tamanho: " + this.tamanho);
        return null;
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }
}
