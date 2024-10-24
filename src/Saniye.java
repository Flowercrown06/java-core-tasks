import java.util.Scanner;
public class Saniye {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saniyeni daxil edin: ");
        int vaxt=scanner.nextInt();
        int saat=vaxt/3600;
        int a=vaxt%3600;
        int deq=a/60;
        int san=a%60;
        System.out.println(saat+" saat "+deq+" deqiqe "+san+" saniye");
        }
}