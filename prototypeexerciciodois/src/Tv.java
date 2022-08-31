public abstract class Tv {

    protected double vlrTv;
    protected String polegadas;

    public abstract String infoTv();

    public abstract Tv clone();

    public double getVlrTv() {
        return vlrTv;
    }

    public void setVlrTv(double vlrTv) {
        this.vlrTv = vlrTv;
    }

    public String getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }
}
