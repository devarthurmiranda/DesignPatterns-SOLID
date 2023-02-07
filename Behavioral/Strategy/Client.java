public class Client{
    public static void main(String[] args) {
        // Testando o Sistema
        TaxCalculator calculator = new TaxCalculator();
        TaxFactory factory = new TaxFactory();
        Tax tax;
        tax = factory.getTax("ICMS", 1000);
        System.out.println("ICMS: " + calculator.calculate(tax));
        tax = factory.getTax("IPI", 1000);
        System.out.println("IPI: " + calculator.calculate(tax));
    }
}