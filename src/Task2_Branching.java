import java.util.Scanner;

public class Task2_Branching {
    public static void main(String[] args) {
        System.out.println("Введите ЧЕТЫРЕ числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

//        int max = Math.max(Math.min(a, b), Math.min(c, d));

        int min1, min2, max;
        if (a > b) min1 = b;
        else min1 = a;
        if (c > d) min2 = d;
        else min2 = c;
        if (min1 > min2) max = min1;
        else max = min2;
        System.out.println(max);
    }
}
