//Array-də maksimum və minimum elementlərin yerini dəyişən metod yaradın
import java.util.Arrays;
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 54, 2, 55, 2, 123, 2};
        int max = arr[0];
        int min = arr[0];
    }

    public static int changeElement(int arr[], int max, int min) {
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for(int j=0; j<arr.length;j++){
            if (arr[j] < min) {
                min = arr[j];
            }
        }

//        max += min;
//        min = max - min;
//        max = max - min;

        return max;
    }
}

