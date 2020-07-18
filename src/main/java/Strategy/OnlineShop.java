package Strategy;

public class OnlineShop {

    private PriceCalculator priceCalculator;
    private PaymentTypeChoser paymentTypeChoser;

    public OnlineShop(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public OnlineShop(PaymentTypeChoser paymentTypeChoser) {
        this.paymentTypeChoser = paymentTypeChoser;
    }

    public double calculatePrice (double corePrice){
        return priceCalculator.calculate(corePrice);
    }

    public String showChosenPaymentType (String paymentType){
        return paymentTypeChoser.chosePayType(paymentType);
    }

    public void setPriceCalculator(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public void setPaymentTypeChoser(PaymentTypeChoser paymentTypeChoser) {
        this.paymentTypeChoser = paymentTypeChoser;
    }
}
