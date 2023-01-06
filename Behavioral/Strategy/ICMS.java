// Implementação do imposto específico   
public class ICMS extends ATax {

    ATax value;

    public ICMS(double value){
        super.value = value;
    }

    @Override
    public double calculate() {
        return super.value * 0.2;
    }

}
