//Implementação do imposto específico
public class IPI extends AImposto {

     AImposto valor;

    public IPI(double valor){
        super.valor = valor;
    }

    @Override
    public double calcular() {
        return super.valor * 0.5 ;
    }

}
