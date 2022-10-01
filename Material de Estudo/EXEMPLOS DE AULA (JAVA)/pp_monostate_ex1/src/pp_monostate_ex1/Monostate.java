package pp_monostate_ex1;

public class Monostate {
	private static String x;
	
	public Monostate (){}
	
	public String getX() {
		return Monostate.x;
	}
		
	public void setX(String value) {
		Monostate.x = value;
	}
		

}
