import java.util.Scanner;
import java.util.Arrays;

public class n142 {
    public static void main(String[] args) {
        System.out.println("enter the number; ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String num = Integer.toString(number);
        int b, c = 0, d = 0;
        int[] arr = {0, 2, 4, 6, 8};
        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            b = number % 10;
            number /= 10;
            array[i] = b;
        }
        for (int j : array) {
            for (int k : arr) {
                if (j == k) {
                    c++;
                }
            }
        }
        if (c == num.length()) {
            System.out.println("Ancaq cut reqemler var");
        }
        else if(c==0){
            System.out.println("Ancaq tek reqemler var");
        }
        else{
            System.out.println("Hem tek,hem cut reqemler var");
        }
    }
}
