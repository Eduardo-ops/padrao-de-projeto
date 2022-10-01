public class main {

    public static void main(String[] args) {

        PizzaMG pizzaMG = new PizzaMG();
        pizzaMG.setNome("Calabresa");
        pizzaMG.setSabor("Calabresa");
        pizzaMG.setTamanho(8);

        pizzaMG.informacoesDePizzaMG();

        Pizza pizzaCloneDePizzaMG = pizzaMG.clone();
        pizzaCloneDePizzaMG.setTamanho(4);

        System.out.println("Pizza clonada: " + pizzaCloneDePizzaMG.getNome() + " | sabor: " + pizzaCloneDePizzaMG.getSabor() + " | tamanho: " + pizzaCloneDePizzaMG.getTamanho());

    }
}
