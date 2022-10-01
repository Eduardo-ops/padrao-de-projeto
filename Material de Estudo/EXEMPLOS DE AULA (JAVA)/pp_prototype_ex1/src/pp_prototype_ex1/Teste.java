package pp_prototype_ex1;

public class Teste {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		GM gm = new GM();
		gm.preco = 150000;
		
		Carro clone_gm;
		clone_gm = gm.clone();
		
		gm.setNomeModelo("Onix");
		gm.setPreco();
		
		clone_gm.setNomeModelo("Spin");
		clone_gm.setPreco();
		
		clone_gm.preco = 200000;
		gm.infoCarro();
		System.out.println("Carro GM "+clone_gm.nomeModelo+" valor "+clone_gm.getPreco());
				
	}

}
