public class FormalAttireFactory extends AttireFactory {
    // Singleton.
    private static AttireFactory factory = null;
    public static AttireFactory getFactory() {
        if(factory == null){
            factory = new FormalAttireFactory();
        }
        return factory;
    }

    // Métodos de fábrica para deixar claro o que deve ser criado, passando pela interface respectiva.
    @Override
    public TorsoInterface criarRoupaTronco() {
        return new Camisa();
    }
    @Override
    public HeadInterface criarRoupaCabeca() {
        return new Chapeu();
    }
    @Override
    public LegInterface criarRoupaPernas() {
        return new Calca();
    }
}