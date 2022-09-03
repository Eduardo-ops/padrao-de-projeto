public class Citroen extends Carro {

    public Citroen() {

    }

    protected Citroen(Citroen carro) {
        this.nomeModelo = carro.getNomeModelo();
        this.preco = carro.getPreco();
    }

    public String infoCarro() {
        System.out.println("Carro Citroen " + this.nomeModelo + " valor " + this.getPreco());
        return null;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }
}
