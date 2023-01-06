// Gender class that is triggered according to the parameter passed in the factory
public class Homem extends Pessoa {
    public Homem(String nome) {
        super.nome = nome;
        System.out.println("Ola senhor " + nome);
    }
}
