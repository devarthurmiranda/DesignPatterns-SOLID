// Cliente do sistema.
public class Client {
    public static void main(String[] args) {
        AttireFactory casualFactory = AttireFactory.getFactory("casual");
        AttireFactory formalFactory = AttireFactory.getFactory("formal");
        Mannequin manequim = new Mannequin();
        manequim.putClothes(casualFactory);
        manequim.showClothing();
        manequim.putClothes(formalFactory);
        manequim.showClothing();
    }
}
