import java.util.Scanner;
public class UsluSayilar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int power;
        int result=1;

        System.out.println("Sayı giriniz:");
        num=sc.nextInt();
        System.out.println("Kuvvet giriniz:");
        power=sc.nextInt();

        for (int i=1; i<=power;i++) {
            result *= num;

        }
        System.out.println("Sonuç: " + result);


    }

}
