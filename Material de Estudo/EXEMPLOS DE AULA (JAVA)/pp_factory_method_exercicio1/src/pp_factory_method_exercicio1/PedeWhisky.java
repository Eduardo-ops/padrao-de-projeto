package pp_factory_method_exercicio1;

public class PedeWhisky extends ChamaOGarcom{

	public Bebida FazPedido() {
		return new Whisky();
	}
}
