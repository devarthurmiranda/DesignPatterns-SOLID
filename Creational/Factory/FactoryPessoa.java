public class FactoryPessoa {
    // Singleton pattern to ensure that there is only one instance of the class
    private static FactoryPessoa factory = null;
    public static FactoryPessoa getFactory() {
        if(factory == null){
            factory = new FactoryPessoa();
        }
        return factory;
    }

    // Method that returns the respective message + name, according to gender
    public Pessoa getPessoa(String nome, String sexo){
        switch(sexo){
            case "M":
                return new Homem(nome);
            case "F":
                return new Mulher(nome);
            default:
                return null;
        }
    }
}
