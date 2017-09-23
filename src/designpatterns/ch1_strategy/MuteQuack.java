package designpatterns.ch1_strategy;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Dead Silence >>");
    }
}
