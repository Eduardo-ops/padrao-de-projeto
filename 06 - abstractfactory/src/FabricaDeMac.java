public class FabricaDeMac extends Fabrica {

    @Override
    Botao CriarBotao() {
        return new BotaoMac();
    }

    @Override
    Formulario CriarFormulario() {
        return new FormularioMac();
    }
}
