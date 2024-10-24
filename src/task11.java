import java.util.Scanner;
import java.util.Arrays;
public class task11 {
    public static void main(String[] args) {
        int [] arr= {0,1,2,3,4,5,6,};
        int[] arr2= new int [arr.length];
        int a=0;
        int b= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[a]){
                arr2[a]=arr[i];
                a++;
            }
        }

        System.out.println(Arrays.toString(arr2));

    }
}
