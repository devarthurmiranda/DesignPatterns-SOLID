public class Singleton {
    // Instance in singleton must be private
    private static Singleton instance = null;

    // When we create the getSingleton method, it checks if an instance already exists,
    // if it does not exist, a new instance is created
    public static Singleton getSingleton(){
        if(instance == null){
            System.out.println("Instancia criada com sucesso!");
            instance = new Singleton();
        }else{
            System.out.println("Instancia ja criada anteriormente!");
        }
        return instance;
    }
}
