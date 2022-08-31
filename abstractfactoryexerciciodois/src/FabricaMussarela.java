public class FabricaMussarela extends FabricaMassa {

    @Override
    Pizza CriaPizza() {
        return new PizzaMussarela();
    }

    @Override
    Pao CriaPao() {
        return new PaoMussarela();
    }
}
