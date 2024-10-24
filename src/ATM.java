import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Balansinizi daxil edin; ");
        int balans=scn.nextInt();
        System.out.println("1. Mədaxil\n"+"2. Məxaric\n"+"3. Balans");
        System.out.println("Seciminizi daxil edin; ");
        int secim=scn.nextInt();
        switch (secim){
            case 1:
                System.out.println("Mədaxil edəcəyiniz məbləği seçin: ");
                int md= scn.nextInt();
                balans+=md;
            case 2:
                System.out.println("Məxaric edəcəyiniz məbləği seçin: ");
                int mx= scn.nextInt();
                balans-=mx;
            case 3:
                System.out.println("Balans "+balans+" azn");
                break;
            default:
                System.out.println("Dogru secim edin ;( ");

        }
    }
}
