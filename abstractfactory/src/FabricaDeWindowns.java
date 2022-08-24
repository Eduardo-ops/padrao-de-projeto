public class FabricaDeWindowns extends Fabrica {

    @Override
    Botao CriarBotao() {
        return new BotaoWindows();
    }

    @Override
    Formulario CriarFormulario() {
        return new FormularioWindows();
    }
}
