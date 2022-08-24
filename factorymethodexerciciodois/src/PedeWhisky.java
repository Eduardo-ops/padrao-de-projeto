public class PedeWhisky extends ChamaOGarcom {

    @Override
    public Bebida fazPedido() {
        Whisky whisky = new Whisky();
        return whisky;
    }
}
