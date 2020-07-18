package Decorator.Coffee;

public abstract class Beverage {

    public String description = "Base beverage";

    public String getDescription() {
        return description;
    }

    public abstract Double getCost();
}
