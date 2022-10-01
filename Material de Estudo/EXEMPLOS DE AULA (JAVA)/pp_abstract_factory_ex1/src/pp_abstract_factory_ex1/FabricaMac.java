package pp_abstract_factory_ex1;

public class FabricaMac extends Fabrica{

	Botao Botao() {
		// TODO Auto-generated method stub
		return new BotaoMac();
	}

	Formulario Formulario() {
		// TODO Auto-generated method stub
		return new FormularioMac();
	}

	
}
