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
    public Person getPerson(String name, String gender){
        switch(gender){
            case "M":
                return new Man(name);
            case "F":
                return new Woman(name);
            default:
                return null;
        }
    }
}
