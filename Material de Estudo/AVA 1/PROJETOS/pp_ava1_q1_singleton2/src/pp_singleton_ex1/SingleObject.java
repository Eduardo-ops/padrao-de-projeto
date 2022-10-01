package pp_singleton_ex1;

public class SingleObject {
  //criar o objeto do SingleObject
	
  //tornar o construtor privado para que a classe não possa
  //ser instanciada
	private SingleObject() {}
	
  //torne o objeto disponível
	
	public void showMessage() {
		System.out.println("Hello Singleton!");
	}
}
