package Decorator.Coffee;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
