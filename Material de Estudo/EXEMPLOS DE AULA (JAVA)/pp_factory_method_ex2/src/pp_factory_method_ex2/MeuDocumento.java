package pp_factory_method_ex2;

public class MeuDocumento extends Documento {

	@Override
	public void abrir() {
		System.out.println("Documento Aberto.");
	}
}
