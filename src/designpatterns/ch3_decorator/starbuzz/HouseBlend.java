package designpatterns.ch3_decorator.starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}