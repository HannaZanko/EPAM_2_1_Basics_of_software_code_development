import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Insert x: ");
        double x = new Scanner(System.in).nextDouble();
        System.out.println("Insert y: ");
        double y = new Scanner(System.in).nextDouble();
        System.out.println((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));

    }
}
