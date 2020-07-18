package Decorator.Pizza.Addiction;

import Decorator.Pizza.AddictionDecorator;
import Decorator.Pizza.Pizza;

public class Pepperoni extends AddictionDecorator {

    private Pizza decorated;

    public Pepperoni(Pizza pizza) {
        this.decorated = pizza;
    }

    String decorator = "pepperoni";
    Double decoratorCost = 5.0;


    @Override
    public Double getCost() {
        Double costOfDecorated = decorated.getCost();
        return costOfDecorated + decoratorCost;
    }

    @Override
    public String getDescription() {
        String descriptionOfDecorated = decorated.getDescription();
        return descriptionOfDecorated + " with " + decorator;
    }
}
