import controleremote.ComVolume;
import controleremote.ControleRemoto;
import dispositivo.Radio;

public class Client2 {

    public static void main(String[] args) {

        Radio radio1 = new Radio();
        ControleRemoto controleRemotoRadio = new ControleRemoto(radio1);
        ComVolume comVolume = new ComVolume(radio1);

        controleRemotoRadio.togglePower();
        comVolume.volumeUp();
    }
}
