public class main {
    public static void main(String[] args) {

        FabricaMussarela fabricaMussarela = new FabricaMussarela();
        FabricaCalabresa fabricaCalabresa = new FabricaCalabresa();

        Pao pao1 = fabricaMussarela.CriaPao();
        Pao pa02 = fabricaCalabresa.CriaPao();

        pao1.CriaPao();
        pa02.CriaPao();

        Pizza pizza1 = fabricaMussarela.CriaPizza();
        Pizza pizza2 = fabricaCalabresa.CriaPizza();

        pizza1.CriaPizza();
        pizza2.CriaPizza();

    }
}
