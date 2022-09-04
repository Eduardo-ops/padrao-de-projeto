public class FactoryFormula1 extends FactoryEsporte {

    @Override
    Capacete CriarCapacete() {
        return new CapaceteFormula1();
    }

    @Override
    Roupa CriarRoupa() {
        return new RoupaFormula1();
    }
}
