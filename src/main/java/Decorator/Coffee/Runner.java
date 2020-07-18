package Decorator.Coffee;

import Decorator.Coffee.Addiction.Milk;
import Decorator.Coffee.Addiction.Sugar;

public class Runner {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage blackCoffee = new BlackCoffee();
        Beverage milkWithBlackCoffee = new Milk(blackCoffee);

        Double cost = milkWithBlackCoffee.getCost();
        Double cost2 = new Milk(new Espresso()).getCost();
        String description = new Milk(new BlackCoffee()).getDescription();

        System.out.println(cost + " " + description);

        Double espressoMilkSugar = new Milk(
                new Sugar(
                        new Espresso())).getCost();
//        System.out.println(espressoMilkSugar);


    }

}
