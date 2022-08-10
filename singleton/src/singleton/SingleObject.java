package singleton;

public class SingleObject {

	// �nico objeto singleton criado.
	private static SingleObject instanciaUnica = null;

	// Construtor privado para evitar de qualquer outra classe instanciar um novo
	// objeto.
	private SingleObject() {

	}

	// Possibilitando que o unico objeto criado seja acess�vel.
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
