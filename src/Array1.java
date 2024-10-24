//Array-də ən böyük və ən kiçik elementi tapan metod yaradın
import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        int[] arr={23,45,54,2,55,2,123,2};
        int max=arr[0];
        int min=arr[0];
        maxelement(arr,max);
        minelement(arr,min);
    }

    public static int maxelement (int arr[], int max){

        for (int i : arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("The maximum element of the array is "+ max);
        return max;
    }
    public static int minelement (int arr[], int min){
        for (int j : arr){
            if(j<min){
                min=j;
            }
        }
        System.out.println("The minimum element of the array is "+ min);
        return min;
    }



}
