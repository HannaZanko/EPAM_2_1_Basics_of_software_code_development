import java.util.Scanner;

public class Task7_Cycle {
    public static void main(String[] args) {
        System.out.println("Введите два числа m и  n: ");
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        for (int i = n; i <= m; i++) {
            System.out.print("Делители числа " + i + " : ");
            for (int j = 2; j <= m; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
