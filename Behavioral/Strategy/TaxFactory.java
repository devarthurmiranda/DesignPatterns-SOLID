public class TaxFactory {
    
    // Singleton Pattern - Aqui é definido o construtor como privado para que não seja possível criar 
    // uma instância da classe FactoryImposto.
    private static TaxFactory factory = null;
    public static TaxFactory getFactory() {
        if (factory == null) {
            factory = new TaxFactory();
        }
        return factory;
    }

    // Factory Method - Aqui é definido o método getImposto que retorna uma instância de Imposto.
    public Tax getImposto(String tipo, double valor){
        switch (tipo) {
            case "ICMS":
                return new ICMS(valor);
            case "IPI":
                return new IPI(valor);
        }
        return null;
    }

}
