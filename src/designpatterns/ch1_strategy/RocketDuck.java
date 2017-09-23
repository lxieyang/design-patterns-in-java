package designpatterns.ch1_strategy;

public class RocketDuck extends Duck {
    public RocketDuck() {
        flyBehavior = new FlyWithRocketPowered();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rocket Duck!");
    }
}
