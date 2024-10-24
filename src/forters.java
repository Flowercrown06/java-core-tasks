import java.util.Scanner;
public class forters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");
        /*int eded=scanner.nextInt();
        String a=String.valueOf(eded);
        int b=a.length();
        int ters = 0;
        for ( int i=0; i<b; i++){
            ters = 10 * ters + eded % 10;
            eded /= 10;}
        System.out.println("Ededin tersi: "+ ters);*/
        String eded = scanner.nextLine();
        String ters = "";
        for (int i= eded.length()-1; i>=0;i--){
            ters+=eded.charAt(i);

        }
        System.out.println(ters);
    }

}
