public class main {
    public static void main(String[] args) {

        String bebida = "W";

        // Crie uma instância de pede cerveja
        PedeCerveja pedeCerveja = new PedeCerveja();
        pedeCerveja.fazPedido();

        // Crie uma instância de Whyski
        PedeWhisky pedeWhisky = new PedeWhisky();
        pedeWhisky.fazPedido();

        // Crie uma instância em b de Bebida que recebe uma nova
        //instância de Cerveja – utilize o Factory Method;
        Bebida b = pedeCerveja.fazPedido();

        // Crie uma instância em b2 de Whisky que recebe uma nova
        //instância de Whisky – utilize o Factory Method;
        Bebida bDois = pedeWhisky.fazPedido();

        // Execute os métodos Hello e Bebida escolhida a partir de b;
        //vi. Execute os métodos Hello e Bebida escolhida a parir de b2.
        System.out.println(b.BebidaEscolhida());
        System.out.println(bDois.BebidaEscolhida());

    }
}
