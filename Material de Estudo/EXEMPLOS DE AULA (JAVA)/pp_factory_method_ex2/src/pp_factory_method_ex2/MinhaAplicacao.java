package pp_factory_method_ex2;

public class MinhaAplicacao extends Aplicacao {

	Documento criaDocumento() {
        return new MeuDocumento();
	}
	
}
