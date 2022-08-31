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
        gm.infoCarro();// Onix, 150000

        Citroen citroen = new Citroen();

        Carro cloneDeCitroen;

        cloneDeCitroen = cloneDeGm.clone();

        System.out.println("Carro GM " + cloneDeGm.nomeModelo + " valor " + cloneDeGm.getPreco());
        System.out.println("Carro Citroen com Clone de GM" + cloneDeCitroen.nomeModelo + " valor " + cloneDeCitroen.getPreco());

        cloneDeCitroen.setNomeModelo("C3");
        cloneDeCitroen.preco = 35000;

        System.out.println("Carro Citroen modificado " + cloneDeCitroen.nomeModelo + " valor " + cloneDeCitroen.getPreco());
    }
}
