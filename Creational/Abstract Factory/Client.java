// Cliente do sistema.
public class Client {
    public static void main(String[] args) {
        AttireFactory casualFactory = AttireFactory.getFactory("casual");
        AttireFactory formalFactory = AttireFactory.getFactory("formal");
        Mannequin mannequin = new Mannequin();
        mannequin.putClothes(casualFactory);
        mannequin.showClothing();
        mannequin.putClothes(formalFactory);
        mannequin.showClothing();
    }
}
