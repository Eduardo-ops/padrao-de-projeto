package pp_adapter_ex1;

public class Client {

	public static void main(String[] args) {
		Adapter x = new Adapter();
		
		System.out.println(x.isValidEmailAddress("luizdias@univas.edu.br"));
		System.out.println(x.isValidEmailAddress("luiz dias@univas.edu.br"));

	}

}
