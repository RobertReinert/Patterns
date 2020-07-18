package Strategy;

public class PolishPriceCalc implements PriceCalculator {
    @Override
    public double calculate(double corePrice) {
        return corePrice * 4.5;
    }
}
