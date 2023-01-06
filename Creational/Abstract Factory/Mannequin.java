public class Mannequin {
    TorsoInterface tronco;
    LegInterface pernas;
    HeadInterface cabeca;

    // Construtor de manequim (sem roupa específica), que irá mostrar mensagem quando o objeto for criado.
    public Mannequin() {
        System.out.println("\nCriando manequim sem roupa...");
    }

    // Método para colocar roupa no manequim, onde
    public void colocarRoupa(AttireFactory factory) {
        System.out.println("\nColocando roupa no manequim...");
        this.cabeca = factory.criarRoupaCabeca();
        this.tronco = factory.criarRoupaTronco();
        this.pernas = factory.criarRoupaPernas();
    }

    // Mostra o objeto concreto (roupa) que foi criado, junto com seu endereço.
    public void mostraRoupa() {
        System.out.println("Cabeca:  " + this.cabeca);
        System.out.println("Tronco: " + this.tronco);
        System.out.println("Pernas: " + this.pernas);
    }

}