public class Mannequin {
    HeadInterface head;
    TorsoInterface torso;
    LegInterface legs;
    

    // Mannequin builder (no specific outfit), which will show message when the object is created
    public Mannequin() {
        System.out.println("\nCreating mannequin without clothes...");
    }

    // Method for putting clothes on the mannequin
    public void putClothes(AttireFactory factory) {
        System.out.println("\nPutting clothes on the mannequin...");
        this.head = factory.createHeadClothing();
        this.torso = factory.createTorsoClothing();
        this.legs = factory.createLegClothing();
    }

    // Shows the concrete object (clothing) that was created, along with its address
    public void showClothing() {
        System.out.println("Head:  " + this.head);
        System.out.println("Torso: " + this.torso);
        System.out.println("Legs: " + this.legs);
    }

}