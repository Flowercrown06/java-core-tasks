import java.util.Scanner;
public class Ededtersi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ikireqemli ededi daxil edin: ");
        int eded=scanner.nextInt();
        if((eded/100)>0 || eded<10){
            System.out.println("Eded ikireqemli deyil ");
        }
        else{
            int a=eded/10;
            int b=eded%10;
            System.out.println("Ededin tersi: "+ ((b*10)+a));
        }

    }
}
