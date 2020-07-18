package Strategy;

public class JapanesePriceCalc implements PriceCalculator {
    @Override
    public double calculate(double corePrice) {
        return corePrice * 3.5;
    }
}
