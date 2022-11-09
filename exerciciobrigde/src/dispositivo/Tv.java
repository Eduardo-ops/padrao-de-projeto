package dispositivo;

public class Tv implements InterfaceDispositivo {

    private int volume = 10;
    private boolean power = false;
    private String name = "TV";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setPower(boolean powerStatus) {
        this.power = powerStatus;
    }

    @Override
    public boolean getPower() {
        return this.power;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
