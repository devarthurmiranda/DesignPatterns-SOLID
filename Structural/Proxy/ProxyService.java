package Structural.Proxy;

public class ProxyService implements Service {

    private RealService realService;

    public void deleteData(String user) {
        if (user.equals("admin")) {
            realService = new RealService();
            realService.deleteData(user);
        } else {
            System.out.println("You are not allowed to delete data");
        }
    }

}
