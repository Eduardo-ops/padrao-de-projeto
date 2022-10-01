package pp_factory_method_exercicio1;

public class TesteBebida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PedeCerveja c = new PedeCerveja();
		PedeWhisky w = new PedeWhisky();
		
		Bebida b = c.FazPedido();
		
		Bebida b2 = w.FazPedido();
		
		System.out.println(b);
		System.out.println(w);
		
		b2.Hello();
		
		b2.BebidaEscolhida();
				
		
	}

}
