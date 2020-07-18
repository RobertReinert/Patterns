package Decorator.Coffee;

public class BlackCoffee extends Beverage {

    public BlackCoffee(){
        description = "BlackCoffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getCost() {
        return 6.0;
    }
}
