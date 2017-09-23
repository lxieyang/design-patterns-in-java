package designpatterns.ch1_strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        // creating a Mallard Duck
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n");

        // creating a Rocket Duck
        Duck rocketMan = new RocketDuck();
        rocketMan.display();
        rocketMan.performQuack();
        rocketMan.performFly();

    }
}
