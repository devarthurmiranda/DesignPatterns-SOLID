// Classe de sexo que é acionada de acordo com o parâmetro passado na factory.
public class Mulher extends Pessoa {
    public Mulher(String nome) {
        super.nome = nome;
        System.out.println("Ola senhora " + nome);
    }
}
