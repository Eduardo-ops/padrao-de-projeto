import java.util.ArrayList;
import java.util.List;

public class Compra implements Venda {

    List<Venda> listaProdutosDaVenda = new ArrayList<Venda>();

    @Override
    public void detalhesCompra() {
        for (Venda venda : listaProdutosDaVenda) {
            venda.detalhesCompra();
        }
    }

    @Override
    public void adicionarProduto(Venda venda) {
        listaProdutosDaVenda.add(venda);
    }

    @Override
    public void removerProduto(Venda venda) {
        listaProdutosDaVenda.remove(venda);
    }
}
