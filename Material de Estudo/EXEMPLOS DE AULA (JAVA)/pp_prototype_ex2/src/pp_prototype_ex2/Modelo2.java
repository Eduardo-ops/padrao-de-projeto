package pp_prototype_ex2;

public class Modelo2 extends Tv {

	protected Modelo2(Modelo2 tv) {
		this.polegadas = tv.getPolegadas();
		this.vlrTv = tv.getVlrTv();
	}
	
	public Modelo2() {}
	
	public String infoTv() {
		System.out.println("Tv Modelo 1 tela "+this.polegadas+" valor "+this.getVlrTv());
		return null;
	}
	
	public Tv clone() {
		return new Modelo2(this);
	}
}
