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
    public HeadInterface createHeadClothing() {
        return new Cap();
    }
    
    @Override
    public TorsoInterface createTorsoClothing() {
        return new Tshirt();
    }
    
    @Override
    public LegInterface createLegClothing() {
        return new Shorts();
    }
}
