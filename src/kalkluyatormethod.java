import java.util.Scanner;

public class kalkluyatormethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 ci ededi daxil edin: ");
        float first= sc.nextFloat();
        System.out.println("2 ci ededi daxil edin: ");
        float second= sc.nextFloat();
        System.out.println("Etmek istediyiniz emeliyyati secin: ");
        System.out.println("Toplama ucun- 1\n"+"Cixma ucun-2\n"+"Vurma ucun-3\n"+"Bolme ucun-4 daxil edin");
        int sec=sc.nextInt();
        emeliyyat(first,second,sec);

    }
    public static float emeliyyat (float first, float second,int sec){
        switch (sec){
            case 1:
                System.out.println("first+second="+(first+second));
                break;
            case 2:
                System.out.println("first-second="+(first-second));
                break;
            case 3:
                System.out.println("first*second="+(first*second));
                break;
            case 4:
                if(second!=0){
                    System.out.println("first/second="+(first/second));
                }
                else{
                    System.out.println("0-a bolmek olmur");
                }
                break;
            default:
                System.out.println("Emeliyyat movcud deyil");
        }
        return sec;
    }
}
