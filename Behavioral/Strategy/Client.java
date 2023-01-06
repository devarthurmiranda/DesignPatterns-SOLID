public class Client{
    public static void main(String[] args) {
        // Testando o Sistema
        TaxCalculator calculadora = new TaxCalculator();
        TaxFactory factory = new TaxFactory();
        Tax imposto;
        imposto = factory.getImposto("ICMS", 1000);
        System.out.println("ICMS: " + calculadora.calcular(imposto));
        imposto = factory.getImposto("IPI", 1000);
        System.out.println("IPI: " + calculadora.calcular(imposto));
    }
}