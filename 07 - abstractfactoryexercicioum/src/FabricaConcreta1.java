public class FabricaConcreta1 extends FabricaAbstrata {

    @Override
    ProdutoAbstratoA CriarProdutoAbstratoA() {
        return new ProdutoA1();
    }

    @Override
    ProdutoAbstratoB CriarProdutoAbstratoB() {
        return new ProdutoB1();
    }
}
