import java.util.HashMap;
import java.util.Map;
// Classe do servidor
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    //Cliente passa a cadeia do objeto desejado ao server, que o armazena em um campo. O server pode ter várias cadeias de objetos.
    // Issso deixa o código mais flexível e faz com que testar a classe server seja mais fácil.
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    // Server pega email/senha do cliente e envia requisição de autorização para a cadeia de Middleware
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // Faz qualquer coisa após o Login

            return true;
        }
        return false;
    }

    // Método para registrar novos usuários
    public void register(String email, String password) {
        users.put(email, password);
    }

    // Método para verificar se o email existe
    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    // Método para verificar se a senha é válida
    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}