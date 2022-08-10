package monostate;

public class main {

	public static void main(String[] args) {

		var altura = new Monostate();
		var largura = new Monostate();

		altura.getAlgura();
		largura.getLargura();

		System.out.println(altura);
		System.out.println(largura);

		altura.setAlgura(1);

		System.out.println(altura);

	}

}
