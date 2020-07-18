package Decorator.Pizza;

import Decorator.Pizza.Addiction.Mozarella;
import Decorator.Pizza.Addiction.Pepperoni;

public class Runner {
    public static void main(String[] args) {
        Pizza capriciosa = new Capriciosa();
        Pizza capriWithPepperoni = new Pepperoni(capriciosa);
        Pizza capriPepperoniMozarella = new Pepperoni(new Mozarella(capriciosa));

        Double cost = capriWithPepperoni.getCost();
        System.out.println(cost);
        String description = capriWithPepperoni.getDescription();
        System.out.println(description + " cost: " + cost);
        Double cost2 = capriPepperoniMozarella.getCost();
        String description2 = capriPepperoniMozarella.getDescription();
        System.out.println(description2 + " cost: " + cost2);


    }
}
