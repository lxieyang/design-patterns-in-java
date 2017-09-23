package designpatterns.ch1_strategy;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying!");
    }
}
