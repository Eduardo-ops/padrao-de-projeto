public class FactoryFutebolAmericano extends FactoryEsporte {

    @Override
    public Capacete CriarCapacete() {
        return new CapaceteFutebolAmericano();
    }

    @Override
    public Roupa CriarRoupa() {
        return new RoupaFutebolAmericado();
    }
}
