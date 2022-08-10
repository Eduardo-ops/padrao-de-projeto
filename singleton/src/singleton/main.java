package singleton;

public class main {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();

		System.out.println(singleton);
		System.out.println(Singleton.getInstance());

		singleton.showMessage();

	}

}
