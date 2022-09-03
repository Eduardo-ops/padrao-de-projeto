public class main {

    public static void main(String[] args) throws CloneNotSupportedException {

        GM gm = new GM();
        gm.preco = 150000;

        Carro cloneDeGm;
        cloneDeGm = gm.clone();

        gm.setNomeModelo("Onix");
        gm.setPreco();

        cloneDeGm.setNomeModelo("Spin");
        cloneDeGm.setPreco();

        cloneDeGm.preco = 2000000;
//        gm.infoCarro();// Onix, 150000

        // Carro Citroen
        Citroen citroen = new Citroen();

        Carro carroUmcloneDeCitroen;

        citroen.setNomeModelo("C3");
        citroen.preco = 70000;

        carroUmcloneDeCitroen = citroen.clone();// Clone

        System.out.println("Carro Citroen com clone de C3 - Modelo: " + carroUmcloneDeCitroen.nomeModelo + " valor " + carroUmcloneDeCitroen.getPreco());

        // Carro Cactus
        Cactus cactus = new Cactus();

        cactus.setNomeModelo("Cactus");
        cactus.preco = 103000;

        Carro carroDoisCloneDeCactus = cactus.clone();

        System.out.println("Carro 2 Cactus com clone de Cactus Modelo: " + carroDoisCloneDeCactus.nomeModelo + " valor " + carroDoisCloneDeCactus.getPreco());

//        System.out.println("Carro GM " + cloneDeGm.nomeModelo + " valor " + cloneDeGm.getPreco());
//        System.out.println("Carro 1 com Clone de citroen" + carroUmcloneDeCitroen.nomeModelo + " valor " + carroUmcloneDeCitroen.getPreco());

    }
}
