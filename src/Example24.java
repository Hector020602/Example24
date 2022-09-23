import java.util.Scanner;
public class Example24 {
    public static void main(String[] argv) {
        int num;
        double factorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        num = input.nextInt();

        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
