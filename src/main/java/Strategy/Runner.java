package Strategy;

public class Runner {
    public static void main(String[] args) {

        PriceCalculator polishPriceCalculator = new PolishPriceCalc();
        PriceCalculator japanesePriceCalculator = new JapanesePriceCalc();
        PaymentTypeChoser card = new Card();
        PaymentTypeChoser blik = new Blik();

        OnlineShop onlineShop = new OnlineShop(polishPriceCalculator);
        OnlineShop onlineShop1 = new OnlineShop(card);
        double corePrice = 100;
        System.out.println(onlineShop.calculatePrice(corePrice));
        onlineShop.setPriceCalculator(japanesePriceCalculator);
        System.out.println(onlineShop.calculatePrice(corePrice));
        String paymentType = "Card";
        System.out.println(onlineShop1.showChosenPaymentType(paymentType));
        onlineShop1.setPaymentTypeChoser(blik);
        paymentType = "BLIK";
        System.out.println(onlineShop1.showChosenPaymentType(paymentType));


    }



    }

