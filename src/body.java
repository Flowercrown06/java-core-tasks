import java.sql.SQLOutput;
import java.util.Scanner;

public class body {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your height; ");
        double height=sc.nextDouble();//boy
        System.out.print("Enter your weight; ");
        double weight=sc.nextDouble();//ceki

        double index= weight/(height*height);
        if(index<18.5){
            System.out.println("You are thin (zayif)");
        }
        else if(18.5<index && index<=24.9){
            System.out.println("You are ideal (ideal)");
        }
        else if (25<index && index<=29.9){
            System.out.println("You are fat (sisman)");
        }
        else if (30<index && index<=34.9){
            System.out.println("You are obese (obez)");
        }
        else if(index>35){
            System.out.println("You are extremely obese (asiri obez)");
        }
    }
}
