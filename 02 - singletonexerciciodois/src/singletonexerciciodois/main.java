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

		// Compara��o
		System.out.println(carro);
		System.out.println(pessoa);

		// Compara��o 2
		if (carro.equals(pessoa)) {
			System.out.println("� a mesma inst�ncia");
		}
	}

}
