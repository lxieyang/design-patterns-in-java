package designpatterns.ch1_strategy;

public class FlyWithRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket! Call me Rocket Man!");
    }
}
