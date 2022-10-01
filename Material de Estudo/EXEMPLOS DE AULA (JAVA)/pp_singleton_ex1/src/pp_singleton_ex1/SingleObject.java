package pp_singleton_ex1;

public class SingleObject {
  //criar o objeto do SingleObject
	private static SingleObject instance = null;
	
  //tornar o construtor privado para que a classe não possa
  //ser instanciada
	private SingleObject() {}
	
  //torne o objeto disponível
	public static SingleObject getInstance() {
		if(SingleObject.instance == null) {
			SingleObject.instance = new SingleObject();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello Singleton!");
	}
}
