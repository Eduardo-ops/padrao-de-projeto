package pp_abstract_factory_ex1;

public class FabricaWindows extends Fabrica{

	Botao Botao() {
		// TODO Auto-generated method stub
		return new BotaoWindows();
	}

	Formulario Formulario() {
		// TODO Auto-generated method stub
		return new FormularioWindows();
	}

	
}
