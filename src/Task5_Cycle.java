import java.util.Scanner;

public class Task5_Cycle {
    public static void main(String[] args) {
        System.out.println("ВВедите число е: ");
        double e = new Scanner(System.in).nextDouble();
        double[] array = new double[20];
        double sum = 0;
        for (int n = 1; n < array.length; n++) {
            array[n] = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (array[n] > e) {
                sum += array[n];
            } else {
                break;
            }
        }
        System.out.println(sum);

    }
}
