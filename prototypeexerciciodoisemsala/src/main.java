public class main {

    public static void main(String[] args) throws CloneNotSupportedException {


        // e. Implemente uma classe teste e instancie um objeto de PizzaMG para escolher uma pizza de 8 fatias.
        PizzaMG pizzaMG = new PizzaMG();
        pizzaMG.setNome("Pizza Calabresa");
        pizzaMG.setSabor("Calabresa");
        pizzaMG.setTamanho(8);

        // f. Crie um clone dessa mesma pizza, porém para uma versão de 4 fatias.
        Pizza pizzaCloneDeMG = pizzaMG.clone();
        pizzaCloneDeMG.setTamanho(4);

        // Mostrando iformações.
        pizzaMG.informacoesDePizza();
        System.out.println("Informações de pizza MG clonada: " + pizzaCloneDeMG.getNome() + " sabor: " + pizzaCloneDeMG.getSabor() + " tamanho: " + pizzaCloneDeMG.getTamanho());

        // g. Implemente uma nova classe PizzaSP e repita o teste anterior
        PizzaSP pizzaSP = new PizzaSP();
        pizzaSP.setNome("Quatro Queijo");
        pizzaSP.setSabor("Mussarela");
        pizzaSP.setTamanho(8);

        Pizza pizzaCloneDePizzaSp = pizzaSP.clone();
        pizzaCloneDePizzaSp.setTamanho(4);

        pizzaSP.informacoesDePizza();
        System.out.println("Informações de pizza SP clonada: " + pizzaCloneDePizzaSp.getNome() + " sabor: " + pizzaCloneDePizzaSp.getSabor() + " tamanho: " + pizzaCloneDePizzaSp.getTamanho());

    }
}
