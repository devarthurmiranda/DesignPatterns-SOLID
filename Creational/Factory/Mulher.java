// Gender class that is triggered according to the parameter passed in the factory
public class Mulher extends Pessoa {
    public Mulher(String nome) {
        super.nome = nome;
        System.out.println("Ola senhora " + nome);
    }
}
