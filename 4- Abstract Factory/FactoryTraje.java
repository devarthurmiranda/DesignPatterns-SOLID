public abstract class FactoryTraje {
    // Abstraindo o método de criação que será utilizado para o padrão Singleton nas classes filhas.
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
