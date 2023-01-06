public class PersonFactory {
    // Singleton pattern to ensure that there is only one instance of the class
    private static PersonFactory factory = null;
    public static PersonFactory getFactory() {
        if(factory == null){
            factory = new PersonFactory();
        }
        return factory;
    }

    // Method that returns the respective message + name, according to gender
    public Person getPessoa(String nome, String sexo){
        switch(sexo){
            case "M":
                return new Man(nome);
            case "F":
                return new Woman(nome);
            default:
                return null;
        }
    }
}
