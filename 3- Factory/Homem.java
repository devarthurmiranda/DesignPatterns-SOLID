//Classe de sexo que é acionada de acordo com o parâmetro passado na factory.
public class Homem extends Pessoa {
    public Homem(String nome) {
        super.nome = nome;
        System.out.println("Ola senhor " + nome);
    }
}
