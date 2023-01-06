// System client
public class TestePessoa {
    public static void main(String[] args) {
        FactoryPessoa factory = FactoryPessoa.getFactory();
        factory.getPessoa("Arthur", "M");
        factory.getPessoa("Esdeath", "F");
    }
}