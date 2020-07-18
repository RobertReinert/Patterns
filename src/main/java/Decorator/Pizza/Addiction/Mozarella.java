package Decorator.Pizza.Addiction;

import Decorator.Pizza.AddictionDecorator;
import Decorator.Pizza.Pizza;

public class Mozarella extends AddictionDecorator {

    private Pizza decorated;

    public Mozarella(Pizza pizza) {
        this.decorated = pizza;
    }

    String decorator = "mozarella";
    Double cost = 7.0;

    @Override
    public Double getCost() {
        Double costOfDecorated = decorated.getCost();
        return costOfDecorated + cost;
    }

    @Override
    public String getDescription() {
        String descriptionOfDecorated = decorated.getDescription();
        return descriptionOfDecorated + " with " + decorator;
    }
}
