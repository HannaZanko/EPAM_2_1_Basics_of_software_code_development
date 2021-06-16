import java.util.Scanner;

public class Task4_Branching {
    public static void main(String[] args) {
        System.out.println("Enter hole proportions");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println("Enter proportions of the brick");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x <= A && y <= B || x <= B && y <= A || x <= A && z <= B || x <= B && z <= A || y <= A && z <= B || y <= B && z <= A) {
            System.out.println("The brick will pass");
        } else {
            System.out.println("The brick will not pass");
        }
    }
}
