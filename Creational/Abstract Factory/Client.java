// Cliente do sistema.
public class Client {
    public static void main(String[] args) {
        AttireFactory casualFactory = AttireFactory.getFactory("casual");
        AttireFactory formalFactory = AttireFactory.getFactory("formal");
        Mannequin manequim = new Mannequin();
        manequim.colocarRoupa(casualFactory);
        manequim.mostraRoupa();
        manequim.colocarRoupa(formalFactory);
        manequim.mostraRoupa();
    }
}
