// Classe para limitar o número de requisições, a fim de evitar ataques de força bruta e DOS
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    // Nota-se que checkNext pode ser chamado várias vezes, mas a cada minuto a contagem é reiniciada 
    // checkNext pode ser chamado no início e no final do método check, isso deixa a cadeia mais flexível.
    // A flexibilidade se dá pois um elemento da cadeia pode mudar a ordem das checagens, rodando uma checagem antes ou depois de outra.
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        
        return checkNext(email, password);
    }
}