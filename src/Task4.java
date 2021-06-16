import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Insert number nnn.ddd: ");
        double z = new Scanner(System.in).nextDouble();
        double x = z % 1 * 1000;
        x = (int) x;
        double y = (int) z;
        System.out.println(x + y/1000d);
    }

}

