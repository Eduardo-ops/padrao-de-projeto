public class Cerveja implements Bebida {

    public Cerveja() {
        this.Hello();
        this.BebidaEscolhida();
    }

    @Override
    public String Hello() {
        return "Olá!";
    }

    @Override
    public String BebidaEscolhida() {
        return "Você escolheu cerveja!";
    }
}
