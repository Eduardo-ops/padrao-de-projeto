package pp_abstract_factory_ex1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FabricaMac mac = new FabricaMac();
		FabricaWindows win = new FabricaWindows();
		
		Botao b1 = mac.Botao();
		Botao b2 = win.Botao();
		Formulario f1 = mac.Formulario();
		Formulario f2 = win.Formulario();
		
		b1.CriaBotao();
		b2.CriaBotao();
		f1.CriaFormulario();
		f2.CriaFormulario();
	}

}
