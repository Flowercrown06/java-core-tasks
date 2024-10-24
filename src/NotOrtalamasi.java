import java.util.Scanner;
//If Else kullanmadan not ortalamasın hesaplamak
public class NotOrtalamasi {

    public static void main(String[] args) {
        //tek tek yazarsak
        int mat;
        int fizik;
        int kimya;
        int türkçe;
        int tarih;
        int müzik;
        //tek satırda hepsini yazarsak
        //int mat, fizik, kimya, türkçe, tarih, müzik;

        Scanner sc = new Scanner(System.in);


        System.out.println("Matematik: ");
        mat = sc.nextInt();
        System.out.println("-----------");

        System.out.println("Fizik: ");
        fizik = sc.nextInt();
        System.out.println("-----------");

        System.out.println("Kimya: ");
        kimya = sc.nextInt();
        System.out.println("-----------");

        System.out.println("Türkçe: ");
        türkçe = sc.nextInt();
        System.out.println("-----------");

        System.out.println("Tarih: ");
        tarih = sc.nextInt();
        System.out.println("-----------");

        System.out.println("Müzik: ");
        müzik = sc.nextInt();

        double ort;
        ort = (mat + fizik + kimya + türkçe + tarih + müzik) / 6;

        System.out.println("Ortalama: " + ort);

        boolean durum1 = ort >= 60;
        String str = (durum1) ? "Geçtiniz" : "Kaldınız";
        System.out.println(str);

      /*  while (ort == 60) {
            System.out.println("you can not past this lesson");
            break;
        }

        while (60 < ort) {
            System.out.println("you past this lesson");
            break;


        }*/
    }
}