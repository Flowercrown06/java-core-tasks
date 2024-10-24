import java.util.Scanner;

public class ferq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1ci ededi daxil edin; ");
        int a=scanner.nextInt();
        System.out.println("2ci ededi daxil edin; ");
        int b=scanner.nextInt();
     /*19*/   int c=a-b;
        if (c<0){
            c=c*-1;
        }
        System.out.println(c);
        //21
       /* int x,y;
        if (a>b){
            x=a;
            y=b;
        }
        else {
            x=b;
            y=a;
        }
        System.out.println(x+" "+y);*/


    }
}
