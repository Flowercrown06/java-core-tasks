import java.util.Scanner;

public class EKOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, ekob = 0;
        System.out.print("Enter the first number; ");
        int number1  = sc.nextInt();
        System.out.print("Enter the second number; ");
        int number2 = sc.nextInt();
        max = number1 * number2;
        for(int i = max; i > 0; i--)
        {
            if(i % number1 == 0 && i % number2 == 0) {
                ekob = i;
            }
        }
        System.out.println("Ekob = " + ekob);
    }
}
