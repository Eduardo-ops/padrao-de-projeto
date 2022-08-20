public class Whisky implements Bebida {

    public Whisky() {
        this.Hello();
        this.BebidaEscolhida();
    }

    @Override
    public String Hello() {
        return "Olá!!!";
    }

    @Override
    public String BebidaEscolhida() {
        return "Você escolheu Whisky!";
    }
}
