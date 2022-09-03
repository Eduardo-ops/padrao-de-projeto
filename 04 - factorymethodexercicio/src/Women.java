public class Women implements Person {

    public Women(String name) {
        System.out.println("Olá senhora " + name);
    }

    @Override
    public String getDescription() {
        return "Objeto: Women";
    }
}
