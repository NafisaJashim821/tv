package segregation;

public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
       humanWorker.work();
       Eatable human = (Eatable) humanWorker;
       human.eat();
       Workable robot = new RobotWorker();
       robot.work();

    }
}
