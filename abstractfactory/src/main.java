public class main {

    public static void main(String[] args) {

        FabricaDeMac fabricaDeMac = new FabricaDeMac();
        FabricaDeWindowns fabricaDeWindowns = new FabricaDeWindowns();

        Botao b1 = fabricaDeMac.CriarBotao();
        Botao b2 = fabricaDeWindowns.CriarBotao();

        Formulario f1 = fabricaDeMac.CriarFormulario();
        Formulario f2 = fabricaDeWindowns.CriarFormulario();

        b1.CriaBotao();
        b2.CriaBotao();

        f1.CriaFormulario();
        f2.CriaFormulario();
    }
}
