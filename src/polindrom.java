import java.util.Scanner;

public class polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sozu daxil edin; ");
        String soz=sc.nextLine();
        String ters="";
        for (int i=soz.length()-1; i>=0; i--){
            ters+=soz.charAt(i);
           // System.out.println(soz.charAt(i));
        }
        //System.out.println(ters);
        if(soz.equals(ters)){
            System.out.println("Soz polindromdur");
        }
        else{
            System.out.println("Soz polindrom deyil");
        }
    }
}
