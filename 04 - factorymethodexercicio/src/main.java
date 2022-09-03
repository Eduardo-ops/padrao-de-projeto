public class main {

    public static void main(String[] args) {

        String name = "Robertinho";
        String sex = "M";
        Person person = PersonFactory.createPerson(name, sex);

        System.out.println(person.getDescription());

    }
}
