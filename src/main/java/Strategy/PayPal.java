package Strategy;

public class PayPal implements PaymentTypeChoser {
    @Override
    public String chosePayType(String paymentType) {
        return paymentType;
    }
}
