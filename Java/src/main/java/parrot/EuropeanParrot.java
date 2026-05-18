package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot() {
        super(0, 0, false);
    }
    
    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
    
    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
