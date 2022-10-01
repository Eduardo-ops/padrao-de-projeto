public class Client {

    public static void main(String[] args) {

        Adapter1 adaptar1 = new Adapter1();
        adaptar1.subirImagem("Bela e a Fera");
        adaptar1.imprimiImagem("1080x720");

        System.out.println("");

        Adapter2 adaptar2 = new Adapter2();
        adaptar2.subirImagem("Grêmio");
        adaptar2.imprimiImagem("1080x720");
    }
}
