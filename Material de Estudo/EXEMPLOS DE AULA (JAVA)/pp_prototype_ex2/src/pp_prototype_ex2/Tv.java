package pp_prototype_ex2;

public abstract class Tv {

	protected double vlrTv;
	protected String polegadas;
	
	public double getVlrTv() {
		return vlrTv;
	}

	public void setVlrTv(double vtv) {
		this.vlrTv = vtv;
	}
	

	public String getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(String p) {
		this.polegadas = p;
	}
	
	
	public abstract String infoTv();
	
	public abstract Tv clone();
}
