public class FactoryImposto {
    
    //Singleton Pattern - Aqui é definido o construtor como privado para que não seja possível criar uma instância da classe FactoryImposto.
    private static FactoryImposto factory = null;
    public static FactoryImposto getFactory() {
        if (factory == null) {
            factory = new FactoryImposto();
        }
        return factory;
    }

    //Factory Method - Aqui é definido o método getImposto que retorna uma instância de Imposto.
    public Imposto getImposto(String tipo, double valor){
        switch (tipo) {
            case "ICMS":
                return new ICMS(valor);
            case "IPI":
                return new IPI(valor);
        }
        return null;
    }

}
