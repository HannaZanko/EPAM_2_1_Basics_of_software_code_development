import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        if (y >= 0 && y <= 4) {
            if (x >= -2 && x <= 2) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            if (y >= -3 && y <= 0) {
                if (x >= -4 && x <= 4) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            } else {
                System.out.println(false);
            }

        }

    }
}

