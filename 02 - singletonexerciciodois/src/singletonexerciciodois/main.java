package singletonexerciciodois;

public class main {

	public static void main(String[] args) {

		Carro carro = Carro.getInstanceCar();
		Carro pessoa = Carro.getInstanceCar();

		pessoa.ligarCarro();
		carro.getStatusCarro();

		System.out.println("");

		pessoa.desligarCarro();
		carro.getStatusCarro();

		System.out.println("");

		// Comparação
		System.out.println(carro);
		System.out.println(pessoa);

		// Comparação 2
		if (carro.equals(pessoa)) {
			System.out.println("É a mesma instância");
		}
	}

}
