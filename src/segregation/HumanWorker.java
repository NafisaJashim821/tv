package segregation;

public class HumanWorker implements Workable,Eatable {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    public void eat() {
        System.out.println("Human is eating.");

    }
}
