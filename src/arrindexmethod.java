import java.util.Arrays;
import java.util.Scanner;

public class arrindexmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {34, 45, 6, 56, 57, 67, 343};
        System.out.println(Arrays.toString(arr));
        System.out.println("Istediyiniz reqemi daxil edin; ");
        int reqem = scanner.nextInt();
        index(arr,reqem);
    }

    public static int index(int[] arr, int reqem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == reqem) {
                System.out.println("index; " + i);
                break;
            }
        }
        return reqem;
    }
}
