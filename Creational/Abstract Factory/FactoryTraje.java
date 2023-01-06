public abstract class FactoryTraje {
    // Abstracting the creation method that will be used for the Singleton pattern in child classes
    public static FactoryTraje getFactory(String tipo) {
        if (tipo.equals("casual")) {
            return FactoryTrajeCasual.getFactory();
        } else if (tipo.equals("formal")) {
            return FactoryTrajeFormal.getFactory();
        } else {
            return null;
        }
    }

    // Métodos de fábrica para deixar claro o que deve ser criado (nas classes filhas), passando pela interface respectiva.
    public abstract InterfaceTronco criarRoupaTronco();
    public abstract InterfacePernas criarRoupaPernas();
    public abstract InterfaceCabeca criarRoupaCabeca();
}
