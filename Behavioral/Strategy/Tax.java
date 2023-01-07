// A Tax interface is used so that it is possible to create new taxes
// without the need to change the TaxCalculator class.
public interface Tax {

    double calculate();
    
}
