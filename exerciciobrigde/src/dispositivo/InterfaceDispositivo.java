package dispositivo;

public interface InterfaceDispositivo {

    public String getName();

    public void setPower(boolean powerStatus);

    public boolean getPower();

    public void setVolume(int volume);

    public int getVolume();
}
