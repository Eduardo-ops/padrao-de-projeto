public class main {

    public static void main(String[] args) {

        FabricaConcreta1 fabricaConcreta1 = new FabricaConcreta1();
        FabricaConcreta2 fabricaConcreta2 = new FabricaConcreta2();

        ProdutoAbstratoA p1 = fabricaConcreta1.CriarProdutoAbstratoA();
        ProdutoAbstratoA p2 = fabricaConcreta2.CriarProdutoAbstratoA();

        ProdutoAbstratoB b1 = fabricaConcreta1.CriarProdutoAbstratoB();
        ProdutoAbstratoB b2 = fabricaConcreta2.CriarProdutoAbstratoB();

        p1.CriarProdutoAbstratoA();
        p2.CriarProdutoAbstratoA();

        b1.CriarProdutoAbstratoA();
        b2.CriarProdutoAbstratoA();
    }
}
