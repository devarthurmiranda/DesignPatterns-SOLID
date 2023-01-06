// System client
public class Client {
    public static void main(String[] args) {
        PersonFactory factory = PersonFactory.getFactory();
        factory.getPerson("Arthur", "M");
        factory.getPerson("Esdeath", "F");
    }
}