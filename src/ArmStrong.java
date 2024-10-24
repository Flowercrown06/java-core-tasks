import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int a,b,c,sum=0;
        String str=String.valueOf(number);
        b=str.length();
        c=number;
        while(number>0){
            a=number%10;
            number/=10;
            sum+= Math.pow(a,b);

        }
        if(sum==c && b!=1){
            System.out.println(c+" is ArmStrong number");
        }
        else{
            System.out.println(c+" isn't ArmStrong number");
        }
    }
}
