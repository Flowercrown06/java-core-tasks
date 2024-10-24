//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program

import java.util.Arrays;
import java.util.Scanner;
public class ArrayMinMaks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] list= {21, -5, 16, 132, -31, 53, 8, -1000, 998, 256, 88, 90};
        int min=list[0];
        int max=list[0];

        System.out.println("Dizi: " +  Arrays.toString(list));
        System.out.print("Bir sayı giriniz: ");
        int number = sc.nextInt();

        Arrays.sort(list);
        // -1000, -31, -5, 8, 16, 21, 53, 88, 90, 132, 256, 998
        for(int i : list) {

            if(i < number) {
                min=i;
            }
            if(i > number) {
                max=i;
                break;
            }

        }
        System.out.println("Girilen sayı: "+number+"   "+ "Girilen sayıya dizideki en yakın küçük sayı: " + min );
        System.out.println("Girilen sayı: "+number+"   "+ "Girilen sayıya dizideki en yakın büyük sayı: " + max );
        System.out.println(Arrays.toString(list));


    }

}
