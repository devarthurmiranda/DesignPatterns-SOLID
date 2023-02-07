package Structural.Proxy;

public class RealService implements Service {
    public void deleteData(String user) {
        System.out.println("Deleting data...");
    }
}
