import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class SayiTahmin {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
        //int num=(int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];//kullanıcının tahmin hakları için

        boolean Win = false;
        boolean Wrong = false;


        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = sc.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("0 ile 100 arasında bir değer giriniz.");
                if (Wrong) {
                    right++;
                    System.out.println(" Hatalı giriş. Tahmin hakkı: " + (5 - right));
                } else {
                    Wrong = true;
                    System.out.println("\"Hatalı giriş. Tahmin hakkı: " + (5 - right));
                }
                continue;

            }
            if (selected == num) {
                System.out.println("Doğru tahmin. Gizli sayı:" + num);
                Win = true;
                break;
            }
            else {
                System.out.println("Yanlış tahmin!");
                if (selected > num) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyük.");
                }
                else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçük.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan tahmin hakkı : " + (5 - right));
            }

        }
        if (!Win) {
            System.out.println("Kaybettin");
            if (!Wrong) {
                System.out.println("Tahminler:" + Arrays.toString(wrong));
                System.out.println("Gizli sayı: " + num);
            }
        }

    }
}