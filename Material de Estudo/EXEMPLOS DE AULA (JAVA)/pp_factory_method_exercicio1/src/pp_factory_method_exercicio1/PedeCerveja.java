package pp_factory_method_exercicio1;

public class PedeCerveja extends ChamaOGarcom{

	public Bebida FazPedido() {
		return new Cerveja();
	}
	
}
