public class PizzaSP extends Pizza {

    public PizzaSP() {

    }

    public PizzaSP(PizzaSP pizzaSP) {
        this.nome = pizzaSP.getNome();
        this.sabor = pizzaSP.getSabor();
        this.tamanho = pizzaSP.getTamanho();
    }

    public String informacoesDePizza() {
        System.out.println("Pizza SP: " + this.nome + " sabor: " + this.sabor + " tamanho: " + this.tamanho);
        return null;
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }
}
