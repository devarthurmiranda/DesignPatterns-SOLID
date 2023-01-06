// Cliente do sistema.
public class Client {
    public static void main(String[] args) {
        AttireFactory factory_casual = AttireFactory.getFactory("casual");
        AttireFactory factory_formal = AttireFactory.getFactory("formal");
        Mannequin manequim = new Mannequin();
        manequim.colocarRoupa(factory_casual);
        manequim.mostraRoupa();
        manequim.colocarRoupa(factory_formal);
        manequim.mostraRoupa();
    }
}
