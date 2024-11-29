package liskov;



public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 20);
        System.out.println(rect.getArea());
        Shape S = new Square (5);
        System.out.println(S.getArea());

    }
}
