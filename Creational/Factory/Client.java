// System client
public class Client {
    public static void main(String[] args) {
        PersonFactory factory = PersonFactory.getFactory();
        factory.getPessoa("Arthur", "M");
        factory.getPessoa("Esdeath", "F");
    }
}