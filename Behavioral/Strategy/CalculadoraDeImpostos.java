// Esta classe apenas receberá o imposto e calculará de acordo com o método calcular() de cada classe.
public class CalculadoraDeImpostos{
    public double calcular(Imposto imposto){
        return imposto.calcular();
    }
}