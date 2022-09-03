package monostate;

public class main {

	public static void main(String[] args) {

		Monostate altura = new Monostate();
		Monostate largura = new Monostate();

		int algura = altura.getAlgura();
		System.out.println(algura);
		largura.getLargura();

		System.out.println(altura);
		System.out.println(largura);

		altura.setAlgura(1);

		System.out.println(altura);
		
		System.out.println(altura);
		System.out.println(largura);

	}

}
