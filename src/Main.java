import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.println("сан бер радиусга");
        float radius = new Scanner(System.in).nextFloat();
         Circle circle = new Circle(3.14f, radius);
        System.out.println(circle.toString());
        Circle.getArea(circle.getPi(), circle.getRadius());

    }
}