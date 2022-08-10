package singleton;

public class Singleton {

	// Único objeto singleton criado.
	private static Singleton uniqueInstance;

	// Construtor privado para evitar de qualquer outra classe instanciar um novo
	// objeto.
	private Singleton() {

	}

	// Possibilitando que o unico objeto criado seja acessível.
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}

		return uniqueInstance;
	}

	public void showMessage() {
		System.out.println("Hello Singleton!!!");
	}
}
