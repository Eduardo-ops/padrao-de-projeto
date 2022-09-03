public class Cactus extends Carro {

    public Cactus() {

    }

    protected Cactus(Cactus carro) {
        this.nomeModelo = carro.getNomeModelo();
        this.preco = carro.getPreco();
    }

    public String infoCarro() {
        System.out.println("Carro Cactus " + this.nomeModelo + " valor " + this.getPreco());
        return null;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }
}
