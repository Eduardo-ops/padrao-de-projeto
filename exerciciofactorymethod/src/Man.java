public class Man implements Person {

    public Man(String name) {
        System.out.println("Olá senhor " + name);
    }

    public String getDescription() {
        return "Objeto: Man";
    }
}
