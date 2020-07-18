package Decorator.Coffee.Addiction;

import Decorator.Coffee.Beverage;
import Decorator.Coffee.CondimentDecorator;

public class Sugar extends CondimentDecorator {

    private Beverage decorated;

    public Sugar(Beverage beverage) {
        decorated = beverage;
    }

    @Override
    public Double getCost() {
        Double costOfDecorated = decorated.getCost();
        return costOfDecorated + 1.0;
    }

    @Override
    public String getDescription() {
        String descriptionOfDecorated = decorated.getDescription();
        return descriptionOfDecorated + " with " + "Sugar";
    }
}
