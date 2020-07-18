package Strategy;

public class Card implements PaymentTypeChoser {
    @Override
    public String chosePayType(String paymentType) {
        return paymentType;
    }
}
