import java.sql.SQLOutput;
import java.util.Scanner;

public class n139 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Include how many times you will enter");
        int n=sc.nextInt();
        int j=0;
        float s=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the number; ");
            int num=sc.nextInt();
            if(num%2==0){
                s+=num;
                j++;
            }
        }
        s/=n;
        System.out.println("numerical average; "+ s);
        System.out.println("count; "+j);
    }
}
