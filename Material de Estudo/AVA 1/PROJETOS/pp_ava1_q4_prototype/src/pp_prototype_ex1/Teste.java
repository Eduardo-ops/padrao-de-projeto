package pp_prototype_ex1;

public class Teste {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		GM gm = new GM();
		gm.preco = 150000;
		
		Carro clone_gm;
		clone_gm = gm.clone();
		
		gm.setNomeModelo("Onix");
		
		clone_gm.setNomeModelo("Spin");
		
		clone_gm.preco = gm.preco + clone_gm.setPreco();
		
		
		gm.infoCarro();
		System.out.println("Carro GM "+clone_gm.nomeModelo+" valor "+clone_gm.getPreco());
				
	}

}
