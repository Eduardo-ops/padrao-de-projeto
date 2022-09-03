package singleton;

public class SingleObject {

	// Único objeto singleton criado.
	private static SingleObject instanciaUnica = null;

	// Construtor privado para evitar de qualquer outra classe instanciar um novo
	// objeto.
	private SingleObject() {

	}

	// Possibilitando que o unico objeto criado seja acessível.
	public static SingleObject getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new SingleObject();
		}
		return instanciaUnica;
	}

	public void showMessage() {
		System.out.println("Hello Singleton!!!");
	}
}
