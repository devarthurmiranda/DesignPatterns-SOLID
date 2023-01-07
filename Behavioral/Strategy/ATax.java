// This abstract class implements tax in order to generalize tax calculation methods
public abstract class ATax implements Tax{

    protected double value;

    @Override
    public abstract double calculate();
    
}
