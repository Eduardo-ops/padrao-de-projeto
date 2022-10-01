package pp_factory_method_exercicio1;

public class Cerveja implements Bebida {
	
	@Override
	public void Hello() {
		System.out.println("Seja bem vindo!");
	}
	
	public void BebidaEscolhida() {
		System.out.println("Saindo uma cerveja gelada!");
	}
}
