import controleremote.ComVolume;
import controleremote.ControleRemoto;
import dispositivo.Tv;

public class Client {

    public static void main(String[] args) {
        Tv tv = new Tv();
        ControleRemoto cr = new ControleRemoto(tv);
        ComVolume cv = new ComVolume(tv);

        cr.togglePower();
        cv.volumeUp();

        // a)
        cv.volumeDown();

    }
}
