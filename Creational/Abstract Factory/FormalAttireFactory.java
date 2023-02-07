public class FormalAttireFactory extends AttireFactory {
    // Singleton.
    private static AttireFactory factory = null;
    public static AttireFactory getFactory() {
        if(factory == null){
            factory = new FormalAttireFactory();
        }
        return factory;
    }

    // Factory methods to make it clear what should be created, going through the respective interface

    @Override
    public TorsoInterface createTorsoClothing() {
        return new Shirt();
    }
    
    @Override
    public LegInterface createLegClothing() {
        return new Pants();
    }
}