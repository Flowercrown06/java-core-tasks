
import java.util.Arrays;
public class arrayters2 {
    public static void main(String[] args) {
        int[] arr={23,43,54,65,67};
        int b= arr[0];
        int c= arr[1];
        arr[0]=arr[4];
        arr[1]=arr[3];
        arr[3]=c;
        arr[4]=b;
        System.out.println(Arrays.toString(arr));
        /*int a = 0;
        int[] ters= new int[arr.length];
        for (int i = 4; i >= 0; i--) {
            ters[a]=arr[i];
            System.out.println("[" + a + "]=" + arr[i]);
            a++;
        }
        System.out.println(Arrays.toString(ters));*/


    }
}
