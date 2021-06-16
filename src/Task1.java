import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Insert first number: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Insert second number: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Insert third number: ");
        int c = new Scanner(System.in).nextInt();
        double z = ((a - 3) * b / 2d) + c;
        System.out.println(z);
    }
}
