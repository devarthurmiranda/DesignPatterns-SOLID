public class TaxFactory {
    
    // Singleton Pattern - Here the constructor is set to private so that it is not possible to create
    // an instance of the FactoryImposto class
    private static TaxFactory factory = null;
    public static TaxFactory getFactory() {
        if (factory == null) {
            factory = new TaxFactory();
        }
        return factory;
    }

    // Factory Method - Here, the getTax method is defined, which returns an instance of Tax
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
