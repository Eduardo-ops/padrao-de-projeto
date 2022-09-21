public class Cliente {

    public static void main(String[] args) {

        // Inicialização de produtos de limpeza
        Limpeza desinfetante = new Limpeza();
        Limpeza sabaoDeCoco = new Limpeza();

        // Inicialização de produtos de mercearia
        Mercearia macarrao = new Mercearia();
        Mercearia oleo = new Mercearia();

        // Inicializando as compras
        Compra compraUm = new Compra();
        Compra compraDois = new Compra();

        // Realizando uma primeira venda
        compraUm.adicionarProduto(desinfetante);
        compraUm.adicionarProduto(macarrao);
        compraUm.adicionarProduto(oleo);

        System.out.println("***** Venda 1 *****\n");
        System.out.println("**** Tipos de produtos ****");
        compraUm.detalhesCompra();

        compraDois.adicionarProduto(oleo);
        System.out.println("\n");

        System.out.println("***** Venda 2 *****\n");
        System.out.println("**** Tipos de produtos ****");
        compraDois.detalhesCompra();
    }
}
