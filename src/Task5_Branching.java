import java.util.Scanner;

public class Task5_Branching {
    public static void main(String[] args) {
        System.out.println("Enter the value x");
        int x = new Scanner(System.in).nextInt();
        if (x <= 3) {
            System.out.println("The value of function: " + (Math.pow(x,2)-3*x+9));
        } else {
            System.out.println("The value of function: " + (1/(Math.pow(x,3)+6)));
        }
    }
}
