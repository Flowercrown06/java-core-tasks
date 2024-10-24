import java.util.Arrays;
import java.util.Scanner;

public class arrayindex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = {34, 45, 6, 56, 57, 67, 343};
        System.out.println(Arrays.toString(arr));
        System.out.println("Istediyiniz reqemi daxil edin; ");
        int reqem=scanner.nextInt();
        for (int i=0; i<arr.length ; i++){// for(int i : arr){
             if( arr[i]==reqem){
                 System.out.println("index; "+ i);
                 break;
             }
             /*else{
                 System.out.println("Bu reqem massivde yoxdur");
             }*/
        }
    }
}
