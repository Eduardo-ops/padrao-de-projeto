public class PedeCerveja extends ChamaOGarcom {

    @Override
    public Bebida fazPedido() {
        Cerveja cerveja = new Cerveja();
        return cerveja;
    }
}
