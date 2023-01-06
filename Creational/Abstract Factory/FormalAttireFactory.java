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
    public HeadInterface createHeadClothing() {
        return new Hat();
    }

    @Override
    public TorsoInterface createTorsoClothing() {
        return new Shirt();
    }
    
    @Override
    public LegInterface createLegClothing() {
        return new Pants();
    }
}