package Strategy;

public class Blik implements PaymentTypeChoser {
    @Override
    public String chosePayType(String paymentType) {
        return paymentType + "BLIK";
    }
}
