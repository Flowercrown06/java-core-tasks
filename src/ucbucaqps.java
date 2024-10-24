import java.util.Scanner;
import static java.lang.Math.pow;

public class ucbucaqps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ucbucagin birinci terefin daxil et; ");
        float a=scanner.nextFloat();
        System.out.println("Ucbucagin ikinci terefin daxil et; ");
        float b=scanner.nextFloat();
        System.out.println("Ucbucagin ucuncu terefin daxil et; ");
        float c=scanner.nextFloat();

        float p=a+b+c;
        float yariperimetr=p/2;
        float x=yariperimetr*(yariperimetr-a)*(yariperimetr-b)*(yariperimetr-c);
        double sahe= Math.pow(x, 0.5);
        System.out.println("Perimetr= "+p);
        System.out.println("Sahe= "+sahe);
    }
}
