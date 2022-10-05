public class FactoryTrajeCasual extends FactoryTraje {
    // Singleton.
    private static FactoryTraje factory = null;
    public static FactoryTraje getFactory() {
        if(factory == null){
            factory = new FactoryTrajeCasual();
        }
        return factory;
    }
    
    // Métodos de fábrica para deixar claro o que deve ser criado, passando pela interface respectiva.
    @Override
    public InterfaceCabeca criarRoupaCabeca() {
        return new Bone();
    }
    @Override
    public InterfacePernas criarRoupaPernas() {
        return new Bermuda();
    }
    @Override
    public InterfaceTronco criarRoupaTronco() {
        return new Camiseta();
    }
}
