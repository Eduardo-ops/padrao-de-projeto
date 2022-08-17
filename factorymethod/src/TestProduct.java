public class TestProduct {

    public static void main(String[] args) {
        ConcreteCreator test = new ConcreteCreator();

        Product product = test.makeProduct();

        product.Hello();
        test.createAndShow();
    }
}
