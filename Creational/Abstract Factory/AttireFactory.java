public abstract class AttireFactory {
    // Abstracting the creation method that will be used for the Singleton pattern in child classes
    public static AttireFactory getFactory(String tipo) {
        if (tipo.equals("casual")) {
            return CasualAttireFactory.getFactory();
        } else if (tipo.equals("formal")) {
            return FormalAttireFactory.getFactory();
        } else {
            return null;
        }
    }

    // Factory methods to make it clear what should be created, going through the respective interface
    public abstract TorsoInterface createTorsoClothing();
    public abstract LegInterface createLegClothing();
    public abstract HeadInterface createHeadClothing();
}
