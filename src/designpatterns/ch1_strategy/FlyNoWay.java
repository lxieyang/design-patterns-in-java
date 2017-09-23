package designpatterns.ch1_strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I CAN'T fly, sorry!");
    }
}
