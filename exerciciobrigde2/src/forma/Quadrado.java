package forma;

public class Quadrado implements InterfaceForma {

    private String name = "Quadrado";

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
