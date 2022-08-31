public class Modelo2 extends Tv {

    public Modelo2() {

    }

    protected Modelo2(Modelo2 tv) {
        this.polegadas = tv.getPolegadas();
        this.vlrTv = tv.getVlrTv();
    }

    @Override
    public String infoTv() {
        System.out.println("Tv Modelo 1 tela " + this.polegadas + " valor " + this.getVlrTv());
        return null;
    }

    @Override
    public Tv clone() {
        return new Modelo2();
    }
}
