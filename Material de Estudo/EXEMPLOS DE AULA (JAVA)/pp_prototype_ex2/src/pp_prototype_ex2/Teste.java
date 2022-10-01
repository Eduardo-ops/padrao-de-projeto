package pp_prototype_ex2;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modelo1 prototipo = new Modelo1();
		Tv novoModelo = prototipo.clone();
		
		prototipo.setVlrTv(6000);
		prototipo.setPolegadas("65\"");
		novoModelo.setVlrTv(8000);
		novoModelo.setPolegadas("72\"");
		
		prototipo.infoTv();
		novoModelo.infoTv();
	}

}
