package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        Service service = new ProxyService();

        System.out.println("\nTrying with common user:");
        service.deleteData("common user");

        System.out.println("\nTrying with admin:");
        service.deleteData("admin");
    }
}
