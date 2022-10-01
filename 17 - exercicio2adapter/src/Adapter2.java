import apiexternal.ApiImagem2;

public class Adapter2 extends ApiImagem2 implements Target {

    @Override
    public void subirImagem(String imagemAdapter2) {
        ApiImagem2 api2 = new ApiImagem2();
        api2.subirImagem2(imagemAdapter2);
    }

    @Override
    public void imprimiImagem(String proporcaoAdapter2) {
        ApiImagem2 api2 = new ApiImagem2();
        api2.imprimirImagem2(proporcaoAdapter2);
    }
}
