public class PersonFactory {

    public static Person createPerson(String name, String sex) {
        if (sex.equals("M")) {
            return new Man(name);
        } else if (sex.equals("F")) {
            return new Women(name);
        }
        return null;
    }
}
