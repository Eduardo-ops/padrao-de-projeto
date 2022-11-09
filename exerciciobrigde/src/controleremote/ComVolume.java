package controleremote;

import dispositivo.InterfaceDispositivo;

public class ComVolume extends ControleRemoto {

    public ComVolume(InterfaceDispositivo id) {
        super(id);
    }

    public void volumeUp() {
        int oldVolume = this.id.getVolume();
        this.id.setVolume(this.id.getVolume() + 10);

        System.out.println("Volume anterior: " + oldVolume);
        System.out.println("Novo volume: " + this.id.getVolume());
    }

    public void volumeDown() {
        int oldVolume = this.id.getVolume();
        this.id.setVolume(this.id.getVolume() - 10);

        System.out.println("Volume anterior: " + oldVolume);
        System.out.println("Novo volume: " + this.id.getVolume());
    }
}
