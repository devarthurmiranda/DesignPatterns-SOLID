public class FactoryTrajeFormal extends FactoryTraje {
    // Singleton.
    private static FactoryTraje factory = null;
    public static FactoryTraje getFactory() {
        if(factory == null){
            factory = new FactoryTrajeFormal();
        }
        return factory;
    }

    // Métodos de fábrica para deixar claro o que deve ser criado, passando pela interface respectiva.
    @Override
    public InterfaceTronco criarRoupaTronco() {
        return new Camisa();
    }
    @Override
    public InterfaceCabeca criarRoupaCabeca() {
        return new Chapeu();
    }
    @Override
    public InterfacePernas criarRoupaPernas() {
        return new Calca();
    }
}