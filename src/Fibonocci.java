import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0, b=1, s=0;
        for(int i=1;i<=n; i++){
            s=a+b;
            a=b;
            b=s;

        }
        System.out.println(a);

    }
}
//1 1 2 3 5 8