package forma;

public class Circulo implements InterfaceForma{

    private String name = "Círculo";

    private String color = "";


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
