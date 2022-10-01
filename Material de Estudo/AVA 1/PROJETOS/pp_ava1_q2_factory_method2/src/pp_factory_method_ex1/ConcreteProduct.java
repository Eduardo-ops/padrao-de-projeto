package pp_factory_method_ex1;

/**
* Esta classe concreta contém a implementação
* de um tipo de produto específico.
*/

public class ConcreteProduct implements Product {
  
	@Override
	public void Hello() {
		System.out.println("Hello Factory Method!");
	}
  
}
