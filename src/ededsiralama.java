import java.util.Scanner;

public class ededsiralama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String muqayise;
        if(a>b){
            if(a>c){
                if(b>c){
                    muqayise="a>b>c";
                    System.out.println(muqayise);
                }
                else{
                    muqayise="a>c>b";
                    System.out.println(muqayise);

                }
            }
            else{
                muqayise="c>a>b";
                System.out.println(muqayise);
            }
        }
        else if(a<c){
            if(b<c){
                muqayise="c>b>a";
                System.out.println(muqayise);
            }
            else{
                muqayise="b>c>a";
                System.out.println(muqayise);
            }


        }
        else if(a>c){
            muqayise="b>a>c";
            System.out.println(muqayise);
        }

    }
}
