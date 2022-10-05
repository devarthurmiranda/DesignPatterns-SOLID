//Implementação do imposto específico   
public class ICMS extends AImposto {

    AImposto valor;

    public ICMS(double valor){
        super.valor = valor;
    }

    @Override
    public double calcular() {
        return super.valor * 0.2;
    }

}
