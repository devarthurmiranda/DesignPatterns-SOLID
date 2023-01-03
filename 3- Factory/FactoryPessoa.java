public class FactoryPessoa {
    // Padrão singleton para garantir que só exista uma instância da classe.
    private static FactoryPessoa factory = null;
    public static FactoryPessoa getFactory() {
        if(factory == null){
            factory = new FactoryPessoa();
        }
        return factory;
    }

    // Método que retorna a respectiva mensagem + nome, de acordo com o sexo.
    public Pessoa getPessoa(String nome, String sexo){
        switch(sexo){
            case "M":
                return new Homem(nome);
            case "F":
                return new Mulher(nome);
            default:
                return null;
        }
    }
}
