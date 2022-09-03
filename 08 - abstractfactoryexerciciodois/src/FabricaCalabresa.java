public class FabricaCalabresa extends FabricaMassa {

    @Override
    Pizza CriaPizza() {
        return new PizzaCalabresa();
    }

    @Override
    Pao CriaPao() {
        return new PaoCalabresa();
    }
}
