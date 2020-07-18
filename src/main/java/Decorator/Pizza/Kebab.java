package Decorator.Pizza;

public class Kebab extends Pizza {

    public Kebab() {
        description = "Kebab";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getCost() {
        return 20.0;
    }


}
