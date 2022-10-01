package pp_factory_method_ex1;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteCreator test = new ConcreteCreator();
		
		Product product = test.makeProduct();
		
		test.makeProduct();
				
		product.Hello();
		test.createAndShow();
		
		System.out.println(product);
		System.out.println(test);
		
	}

}
