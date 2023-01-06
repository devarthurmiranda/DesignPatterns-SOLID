// Gender class that is triggered according to the parameter passed in the factory
public class Man extends Person {
    public Man(String nome) {
        super.nome = nome;
        System.out.println("Ola senhor " + nome);
    }
}
