public class GM extends Carro {

    public GM() {

    }

    protected GM(GM carro) {
        this.nomeModelo = carro.getNomeModelo();
        this.preco = carro.getPreco();
    }

    public String infoCarro() {
        System.out.println("Carro GM " + this.nomeModelo + " valor " + this.getPreco());
        return null;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }

}
