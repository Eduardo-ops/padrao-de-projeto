package pp_monostate_ex1;

public class MonostateDemo {
	public static void main(String[] args) {
	    Monostate object = new Monostate();
	    Monostate object2 = new Monostate();
	    
	    object.setX("Hello Monostate");
	    
	    if(object != object2) {
	    	System.out.println("Monostate usa instâncias diferentes.");
	    } else {
	    	System.out.println("Falhou o teste.");
	    }
	    
	    
	    System.out.println("Mas compartilham um atributo etático que é igual:");
	    System.out.println(object.getX());
	    System.out.println(object2.getX());

}
}
