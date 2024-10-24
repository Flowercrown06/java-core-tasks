import java.util.Scanner;

public class EBOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, EBOB ;
        System.out.print("Enter the first number; ");
        a = sc.nextInt();
        System.out.print("Enter the second number; ");
        b = sc.nextInt();

        for (int i = a; i > 0; i--) {
            if (b % i == 0 && a % i == 0) {
                EBOB = i;
                System.out.println(EBOB);
                break;
            }
        }
    }
}
