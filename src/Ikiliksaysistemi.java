import java.sql.SQLOutput;
import java.util.Scanner;

public class Ikiliksaysistemi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int a;
        String b=  "", binary="";
        while(decimal>=1){
            a=decimal % 2;
            b+=a;
            decimal/=2;
        }
        for(int i= b.length()-1; i>=0; i--){
            binary+= b.charAt(i);
        }
        System.out.println(binary);
    }
}
