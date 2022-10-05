//Esta classe abstrata implementa imposto a fim de generalizar os métodos de cálculo de impostos.
public abstract class AImposto implements Imposto{

    protected double valor;

    @Override
    public abstract double calcular();
    
}
