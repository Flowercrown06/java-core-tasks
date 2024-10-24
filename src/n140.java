import java.util.Scanner;

public class n140 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number; ");
        int number= sc.nextInt();
        if(number>=3){
            if(number%2==0){
                number-=2;
            }
            else{
                number-=1;
            }
            System.out.println(number);

        }
        else{
            System.out.println("Number must be more than 3");
        }
    }
}
