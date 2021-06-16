import java.time.format.SignStyle;
import java.util.Scanner;

public class Task2_Cycle {
    public static void main(String[] args) {
        System.out.println("Enter a & b: ");
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter step h: ");
        int h = scanner.nextInt();
        for (int i = a; i <=b ; ) {
            if (i<=2) {
                System.out.println(-i);}
            else{
                System.out.println(i);
            }
            i+=h;

        }
    }
}
