public class Task4_Cycle {
    public static void main(String[] args) {
        long s=1;
        for (int i = 1; i <=200 ; i++) {
             s*= Math.pow(i,2);

        }
        System.out.println(s);
    }
}
