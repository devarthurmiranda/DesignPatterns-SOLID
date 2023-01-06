public class Cliente{
    public static void main(String[] args) {
        // Testando o Sistema
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        FactoryImposto factory = new FactoryImposto();
        Imposto imposto;
        imposto = factory.getImposto("ICMS", 1000);
        System.out.println("ICMS: " + calculadora.calcular(imposto));
        imposto = factory.getImposto("IPI", 1000);
        System.out.println("IPI: " + calculadora.calcular(imposto));
    }
}