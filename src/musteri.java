import java.util.Scanner;
public class musteri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Musterinin yasini daxil edin: ");
        int yas = scanner.nextInt();
        System.out.println("Maasi daxil edin: ");
        int maas = scanner.nextInt();
        System.out.println("Is tecrubesini daxil edin, il: ");
        int tecrube = scanner.nextInt();

        if (yas>25 && maas>1200 && tecrube > 2){
             System.out.println("Size 10 min azn kredit dusur");
        }

        else if (yas>20 && yas<=25 && maas>800){
                System.out.println("Size 8 min azn kredit dusur");
        }
        else if (yas>=18 || maas>1000){
            System.out.println("Size 5 min azn kredit dusur");
        }
        else{
            System.out.println("Size kredit dusmur");
        }



    }
}