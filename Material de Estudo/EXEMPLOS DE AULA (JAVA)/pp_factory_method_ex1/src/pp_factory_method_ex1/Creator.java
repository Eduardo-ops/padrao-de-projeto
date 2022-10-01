package pp_factory_method_ex1;

/**
* Abstração de uma Aplicação capaz de manipular
* produtos.
*/

public abstract class Creator {
  
	protected Product prod;
	
	//Abstração do Factory Method
	abstract Product makeProduct();
	
	public void createAndShow() {
		this.prod = this.makeProduct();
		System.out.println("Factory Method criou um novo objeto: ");
		System.out.println(prod);
	}
  
}
