package pp_singleton_ex1;

public class SingletonDemo {
  public static void main(String[] args) {
    //pegue o único objeto disponível
	  SingleObject object = SingleObject.getInstance();
	  SingleObject object2 = SingleObject.getInstance();
	  
	//mostre a mensagem
	  object.showMessage();
	  object2.showMessage();
	  
	  if(object == object2) {
		  System.out.println(object);
		  System.out.println(object2);
		  System.out.println("Singleton funcionou!");
	  } else { 
			  System.out.println("Singleton falhou!");
	  }
	  
  	  
  }
}
