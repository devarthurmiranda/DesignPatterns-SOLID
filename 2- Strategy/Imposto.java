// É utilizada uma interface Imposto a fim de que seja possível criar novos impostos
// sem a necessidade de alterar a classe CalculadoraDeImpostos.
public interface Imposto {

    double calcular();
    
}
