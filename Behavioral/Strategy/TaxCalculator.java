// Esta classe apenas receberá o imposto e calculará de acordo com o método calcular() de cada classe.
public class TaxCalculator{
    public double calculate(Tax tax){
        return tax.calculate();
    }
}