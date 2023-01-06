// Implementação do imposto específico
public class IPI extends ATax {

     ATax value;

    public IPI(double value){
        super.value = value;
    }

    @Override
    public double calculate() {
        return super.value * 0.5 ;
    }

}
