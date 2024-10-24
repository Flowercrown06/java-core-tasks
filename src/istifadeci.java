import java.util.Scanner;

public class istifadeci {
    int balans;


    public static void main(String[] args) {
        istifadeci Efe=new istifadeci();
        Scanner scn=new Scanner(System.in);
        Efe.balans=5000;
        System.out.println("1. Mədaxil\n"+"2. Məxaric\n"+"3. Balans");
        System.out.println("Seciminizi daxil edin; ");
        int secim=scn.nextInt();
        switch (secim){
            case 1:
                System.out.println("Mədaxil edəcəyiniz məbləği seçin: ");
                int md= scn.nextInt();
                Efe.balans+=md;
                System.out.println("Medaxil prosesi ugurla tamamlandi ;) ");
                System.out.println("Balansiniz "+Efe.balans+" azn");
                break;
            case 2:
                System.out.println("Məxaric edəcəyiniz məbləği seçin: ");
                int mx= scn.nextInt();
                if(mx<=Efe.balans){
                    Efe.balans-=mx;
                    System.out.println("Mexaric prosesi ugurla tamamlandi ;) ");
                    System.out.println("Balansiniz "+Efe.balans+" azn");
                }
                else{
                    System.out.println("Hesabinizda kifayet qeder mebleg yoxdur;(");
                }
                break;
            case 3:
                System.out.println("Balans "+Efe.balans+" azn");
                break;
            default:
                System.out.println("Dogru secim edin ;( ");

        }
    }
    /*int say;
    double qiymet;
    String ad;
//murekkeb data tipleri; obyektler
    public static void main(String[] args) {
        mehsul cay= new mehsul();
        cay.ad="AZERCAY";
        cay.say=23;
        cay.qiymet=2.3;

        mehsul yag=new mehsul();
        yag.ad="SANA";
        yag.say=5;
        yag.qiymet=3;

    }*/
}
