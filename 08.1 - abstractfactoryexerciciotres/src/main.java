public class main {

    public static void main(String[] args) {

        // Criação dos produtos capacete e roupa de acordo com a família fórmula 1
        FactoryFormula1 factoryFormula1 = new FactoryFormula1();

        Capacete capaceteUm = factoryFormula1.CriarCapacete();
        Roupa roupaUm = factoryFormula1.CriarRoupa();

        capaceteUm.criaCapacete();
        roupaUm.criaRoupa();

        // Criação dos produtos capacete e roupa de acordo com a família futebol americano
        FactoryFutebolAmericano factoryFutebolAmericano = new FactoryFutebolAmericano();

        Capacete capaceteDois = factoryFutebolAmericano.CriarCapacete();
        Roupa roupaDois = factoryFutebolAmericano.CriarRoupa();

        capaceteDois.criaCapacete();
        roupaDois.criaRoupa();

    }
}
