public abstract class AttireFactory {
    // Abstracting the creation method that will be used for the Singleton pattern in child classes
    public static AttireFactory getFactory(String type) {
        if (type.equals("casual")) {
            return CasualAttireFactory.getFactory();
        } else if (type.equals("formal")) {
            return FormalAttireFactory.getFactory();
        } else {
            return null;
        }
    }

    // Factory methods to make it clear what should be created, going through the respective interface
    public abstract TorsoInterface createTorsoClothing();
    public abstract LegInterface createLegClothing();
}
