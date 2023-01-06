// Gender class that is triggered according to the parameter passed in the factory
public class Man extends Person {
    public Man(String name) {
        super.name = name;
        System.out.println("Hello, mr " + name);
    }
}
