// Classe inicial para o middleware
public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        // Colocar head = first para sinalizar o elo inicial da cadeia
        Middleware head = first;

        // Percorrer a cadeia de Middleware, adicionando o próximo elo como head, até que a cadeia seja completa
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    // Método de checagem abstrato
    public abstract boolean check(String email, String password);

    // Chamada de verificação de próximo elemento da cadeia, ou final da cadeia se não houver próximo
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}