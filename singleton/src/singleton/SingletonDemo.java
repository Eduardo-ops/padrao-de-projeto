package singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		SingleObject singletonObjectUm = SingleObject.getInstance();

		singletonObjectUm.showMessage();

	}

}
