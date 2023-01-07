public class TaxFactory {
    
    // Singleton Pattern - Here the constructor is set to private so that it is not possible to create
    // an instance of the taxFactory class
    private static TaxFactory factory = null;
    public static TaxFactory getFactory() {
        if (factory == null) {
            factory = new TaxFactory();
        }
        return factory;
    }

    // Factory Method - Here, the getTax method is defined, which returns an instance of Tax
    public Tax getTax(String tipo, double value){
        switch (type) {
            case "ICMS":
                return new ICMS(value);
            case "IPI":
                return new IPI(value);
        }
        return null;
    }

}
