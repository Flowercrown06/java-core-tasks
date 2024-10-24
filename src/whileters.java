import java.util.Scanner;
public class whileters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");
        int eded = scanner.nextInt();
        int ters = 0;
        while (eded > 0) {
            ters = 10 * ters + eded % 10;
            eded /= 10;}
        System.out.println("Ededin tersi: "+ ters);


    }
}