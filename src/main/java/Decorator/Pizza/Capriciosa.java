package Decorator.Pizza;

public class Capriciosa extends Pizza {
    public Capriciosa() {
        description = "Capriciosa";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getCost() {
        return 30.0;
    }
}
