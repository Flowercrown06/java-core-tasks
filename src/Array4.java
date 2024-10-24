//Verilən array-də müəyyən bir elementin olub olmadığını yoxlayan metod yazın.
// Əgər element varsa, indeksini qaytarın; yoxdursa, -1 qaytarın.
import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,36,4,8,6,3};
        int times=0;
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter an item; ");
        int num= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("The index is "+i);
                times++;
            }
        }
        if(times==0){
            System.out.println("-1");
        }

    }
}
