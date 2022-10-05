public class Singleton {
    // É importante notar que o construtor é privado
    private static Singleton instance = null;

    // Quando criamos o método getSingleton, ele verifica se já existe uma instância, se não existir, ele cria uma nova instância.
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
