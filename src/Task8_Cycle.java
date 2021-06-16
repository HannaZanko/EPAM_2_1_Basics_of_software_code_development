import java.util.Scanner;

public class Task8_Cycle {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        int num1 = n;
        int num2 = m;
        int c;
        System.out.print("Цифры числа " + num1 + " - ");
        for (; n > 0; n /= 10) {
            c = n % 10;
            System.out.print(c + " ");
        }
        System.out.print("\nЦифры числа " + num2 + " - ");
        for (; m > 0; m /= 10) {
            c = m % 10;
            System.out.print(c + " ");
        }
    }
}
