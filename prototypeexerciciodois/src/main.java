public class main {

    public static void main(String[] args) {

        Modelo1 prototipoModeloUm = new Modelo1();
        Tv novoModelo = prototipoModeloUm.clone();

        prototipoModeloUm.setVlrTv(6000);
        prototipoModeloUm.setPolegadas("65\"");
        novoModelo.setVlrTv(8000);
        novoModelo.setPolegadas("72\"");

        prototipoModeloUm.infoTv();
        novoModelo.infoTv();
    }
}
