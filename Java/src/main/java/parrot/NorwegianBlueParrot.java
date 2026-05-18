package parrot;

public class NorwegianBlueParrot extends Parrot {
    private static final double MAXIMUM_SPEED = 24.0;
    private final double voltage;
    private final boolean isNailed;
    
    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(0, voltage, isNailed);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }
    
    @Override
    public double getSpeed() {
        return isNailed ? 0 : getBaseSpeed(voltage);
    }
    
    private double getBaseSpeed(double voltage) {
        return Math.min(MAXIMUM_SPEED, voltage * getBaseSpeed());
    }
    
    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
