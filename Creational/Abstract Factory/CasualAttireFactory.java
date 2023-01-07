public class CasualAttireFactory extends AttireFactory {
    // Singleton.
    private static AttireFactory factory = null;
    public static AttireFactory getFactory() {
        if(factory == null){
            factory = new CasualAttireFactory();
        }
        return factory;
    }
    
    // Factory methods to make it clear what should be created, going through the respective interface.
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
