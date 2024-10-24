import java.util.Scanner;
public class Telebeninbali {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bali daxil edin: ");
        float bal=scanner.nextFloat();
        if(bal>-1 && bal<31){
            System.out.println("2 qiymeti almisiniz");
        }
        if(bal>30 && bal<61){
            System.out.println("3 qiymeti almisiniz");
        }
        if(bal>60 && bal<81){
            System.out.println("4 qiymeti almisiniz");
        }
        if(bal>80 && bal<101){
            System.out.println("5 qiymeti almisiniz");
        }

       else if(bal<0 || bal>100){
            System.out.println("Bali yanlis daxil etmisiniz");
        }

    }
}
