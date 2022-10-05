// Cliente do sistema.
public class Client {
    public static void main(String[] args) {
        FactoryTraje factory_casual = FactoryTraje.getFactory("casual");
        FactoryTraje factory_formal = FactoryTraje.getFactory("formal");
        Manequim manequim = new Manequim();
        manequim.colocarRoupa(factory_casual);
        manequim.mostraRoupa();
        manequim.colocarRoupa(factory_formal);
        manequim.mostraRoupa();
    }
}
