import java.util.Scanner;

public class Task6_Cycle {
    public static void main(String[] args) {
        System.out.println("Введите символ: ");
        String a = new Scanner(System.in).next();
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a + " - " + (int) a.charAt(i));
        }
    }
}
