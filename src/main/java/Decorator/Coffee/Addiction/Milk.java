package Decorator.Coffee.Addiction;

import Decorator.Coffee.Beverage;
import Decorator.Coffee.CondimentDecorator;

public class Milk extends CondimentDecorator {

    private Beverage decorated;

    public Milk(Beverage beverage){
        decorated = beverage;
    }

    @Override
    public String getDescription() {
        String descriptionOfDecorated = decorated.getDescription();
        return descriptionOfDecorated + " with " + "Milk";
    }

    @Override
    public Double getCost() {
        Double costOfDecorated = decorated.getCost();
        return costOfDecorated + 2.0;
    }


}
