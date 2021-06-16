import java.util.Scanner;

public class Task3_Branching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите координаты второй точки: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Введите координаты третей точки: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        if (x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3) {
            System.out.println("Точки лежат на одной прямой");
        }
        if (x1 != x2 && y1 != y2) {
            double k = (y2 - y1) / (x2 - x1);
            double b = (x2 * y1 - x1 * y2) / (x2 - x1);
            if (y3 == k * x3 + b) {
                System.out.println("Точки лежат на одной прямой");
            } else {
                System.out.println("Точки не лежат на одной прямой");
            }
        }

    }

}

