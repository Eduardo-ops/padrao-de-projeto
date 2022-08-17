/*
 * Esta classe concreta contém a implementação de uma aplicação para manipular produros do tipo ConcreteProduct
 * */
public class ConcreteCreator extends Creator {

    //    Uma implementação do Factory Method. Este método é especializado na
    //    criação de produtos do tip ConcreteProdutc.
    Product makeProduct() {
        return new ConcreteProduct();
    }
}
