public class Client{
    public static void main(String[] args) {
        // Testando o Sistema
        TaxCalculator calculator = new TaxCalculator();
        TaxFactory factory = new TaxFactory();
        Tax tax;
        tax = factory.getImposto("ICMS", 1000);
        System.out.println("ICMS: " + calculator.calculate(tax));
        tax = factory.getImposto("IPI", 1000);
        System.out.println("IPI: " + calculator.calculate(tax));
    }
}