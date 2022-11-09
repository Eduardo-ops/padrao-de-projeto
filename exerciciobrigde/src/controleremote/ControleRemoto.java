package controleremote;

import dispositivo.InterfaceDispositivo;

public class ControleRemoto {

    protected InterfaceDispositivo id;

    public ControleRemoto(InterfaceDispositivo id) {
        this.id = id;
    }

    public void togglePower() {
        this.id.setPower(!this.id.getPower());
        System.out.println("Dispositivo: " + id.getName());
        System.out.println("Power Status: " + this.id.getPower());
    }
}
