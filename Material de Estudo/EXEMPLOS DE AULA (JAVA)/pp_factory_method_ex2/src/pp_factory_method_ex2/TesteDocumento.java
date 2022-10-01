package pp_factory_method_ex2;

public class TesteDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinhaAplicacao doc1 = new MinhaAplicacao();
		Documento doc2 = doc1.criaDocumento();
		
		doc1.novoDocumento();
		doc2.abrir();		
	}

}
