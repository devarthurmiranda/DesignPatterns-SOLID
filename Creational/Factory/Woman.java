// Gender class that is triggered according to the parameter passed in the factory
public class Woman extends Person {
    public Woman(String nome) {
        super.nome = nome;
        System.out.println("Ola senhora " + nome);
    }
}
