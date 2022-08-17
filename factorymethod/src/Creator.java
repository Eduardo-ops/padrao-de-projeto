/*
 * Abstração de uma aplicação capaz de manipular produtos.
 * */
public abstract class Creator {

    protected Product product;

    abstract Product makeProduct();

    public void createAndShow() {
        this.product = this.makeProduct();
        System.out.println("Factory Method criou um novo objeto: " + product);
    }
}
