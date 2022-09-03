public class FabricaConcreta2 extends FabricaAbstrata {

    @Override
    ProdutoAbstratoA CriarProdutoAbstratoA() {
        return new ProdutoA2();
    }

    @Override
    ProdutoAbstratoB CriarProdutoAbstratoB() {
        return new ProdutoB2();
    }
}
