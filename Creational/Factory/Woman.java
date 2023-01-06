// Gender class that is triggered according to the parameter passed in the factory
public class Woman extends Person {
    public Woman(String name) {
        super.name = name;
        System.out.println("Hello, mrs " + name);
    }
}
