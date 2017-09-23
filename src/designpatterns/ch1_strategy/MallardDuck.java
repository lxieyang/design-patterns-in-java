package designpatterns.ch1_strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {     // override the abstract class defined in the Duck class
        System.out.println("I'm a Mallard duck!");
    }
}
