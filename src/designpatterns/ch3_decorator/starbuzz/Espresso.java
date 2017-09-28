package designpatterns.ch3_decorator.starbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
