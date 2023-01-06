// Implementação do imposto específico
public class IPI extends ATax {

     ATax valor;

    public IPI(double valor){
        super.valor = valor;
    }

    @Override
    public double calcular() {
        return super.valor * 0.5 ;
    }

}
