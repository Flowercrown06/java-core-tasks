import java.util.Arrays;
import java.util.Scanner;
public class arrayters {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "]-elementi daxil et:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int a = 0;
        int[] tersarr= new int[5];
        for (int i = 4; i >= 0; i--) {
            tersarr[a]=arr[i];
            System.out.println("[" + a + "]=" + arr[i]);
            a++;
        }
        System.out.println(Arrays.toString(tersarr));

    }
}
