import java.util.Arrays;
//?

//Verilən iki array-dəki kəsişən elementləri tapan metod yazın:
// array1= 1, 2, 3, 4, 5};  array2={3, 4, 5, 6, 7};   output : {3, 4, 5}
public class Method6 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};
        int []arr3 = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[k] = arr2[j];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
