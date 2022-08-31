public class Modelo1 extends Tv {

    public Modelo1() {

    }

    protected Modelo1(Modelo1 tv) {
        this.polegadas = tv.getPolegadas();
        this.vlrTv = tv.getVlrTv();
    }

    public String infoTv() {
        System.out.println("Tv Modelo 1 tela " + this.polegadas + " valor " + this.getVlrTv());
        return null;
    }

    @Override
    public Tv clone() {
        return new Modelo1(this);
    }
}
