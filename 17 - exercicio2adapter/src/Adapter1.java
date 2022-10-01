import apiexternal.ApiImagem1;

public class Adapter1 extends ApiImagem1 implements Target {

    @Override
    public void subirImagem(String imagemAdaptador1) {
        ApiImagem1 api1 = new ApiImagem1();
        api1.subirImagem1(imagemAdaptador1);
    }

    @Override
    public void imprimiImagem(String proporcaoAdaptador1) {
        ApiImagem1 api1 = new ApiImagem1();
        api1.imprimirImagem1(proporcaoAdaptador1);
    }
}
