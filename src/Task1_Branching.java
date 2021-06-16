import java.util.Scanner;

public class Task1_Branching {
    public static void main(String[] args) {
        System.out.println("Введите три угла: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b + c == 180) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
