package Decorator.Pizza;

public abstract class Pizza {
    public String description;
    public abstract Double getCost();

    public String getDescription() {
        return description;
    }
}
