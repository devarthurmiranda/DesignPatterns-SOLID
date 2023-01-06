public class CasualAttireFactory extends AttireFactory {
    // Singleton.
    private static AttireFactory factory = null;
    public static AttireFactory getFactory() {
        if(factory == null){
            factory = new CasualAttireFactory();
        }
        return factory;
    }
    
    // Métodos de fábrica para deixar claro o que deve ser criado, passando pela interface respectiva.
    @Override
    public HeadInterface criarRoupaCabeca() {
        return new Cap();
    }
    @Override
    public LegInterface criarRoupaPernas() {
        return new Shorts();
    }
    @Override
    public TorsoInterface criarRoupaTronco() {
        return new Tshirt();
    }
}
