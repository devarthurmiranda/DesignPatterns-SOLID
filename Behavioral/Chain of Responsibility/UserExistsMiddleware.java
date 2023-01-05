public class UserExistsMiddleware extends Middleware {
    private Server server;

    // Classe para verificar se o usuário/senha existe
    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    // Casos de incompatibilidade de usuário/senha
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}