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

    // Métodos de fábrica para deixar claro o que deve ser criado (nas classes filhas), passando pela interface respectiva.
    public abstract TorsoInterface criarRoupaTronco();
    public abstract LegInterface criarRoupaPernas();
    public abstract HeadInterface criarRoupaCabeca();
}
