import java.util.Scanner;

import static java.lang.Math.pow;

public class elave {
    public static void main(String[] args) {
        System.out.println("X i daxil edin; ");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        double y=3*(Math.pow(x, 2))+5*x-7;

        System.out.println("y= 3x^2 +5x -7= "+y);

    }
}
