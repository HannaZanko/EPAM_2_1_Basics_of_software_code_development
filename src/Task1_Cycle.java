import java.util.Scanner;

public class Task1_Cycle {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int a = new Scanner(System.in).nextInt();
        int s=0;
        for (int i = 1; i <= a ; i++) {
            s+=i;
        }
        System.out.println(s);
    }
}
