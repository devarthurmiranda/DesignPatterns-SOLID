public class Mannequin {
    HeadInterface head;
    TorsoInterface torso;
    LegInterface legs;
    

    // Construtor de manequim (sem roupa específica), que irá mostrar mensagem quando o objeto for criado.
    public Mannequin() {
        System.out.println("\nCreating mannequin without clothes...");
    }

    // Método para colocar roupa no manequim, onde
    public void putClothes(AttireFactory factory) {
        System.out.println("\nPutting clothes on the mannequin...");
        this.head = factory.createHeadClothing();
        this.torso = factory.createTorsoClothing();
        this.legs = factory.createLegClothing();
    }

    // Mostra o objeto concreto (roupa) que foi criado, junto com seu endereço.
    public void showClothing() {
        System.out.println("Head:  " + this.head);
        System.out.println("Torso: " + this.torso);
        System.out.println("Legs: " + this.legs);
    }

}