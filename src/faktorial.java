import java.util.Scanner;
public class faktorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");
        int eded=scanner.nextInt();
        int P=1;
        for(int i=1;i<=eded;i++){
            P*=i;
        }
        System.out.println("Ededin faktoriali: "+P);

        int j=1, fak=1;
        while(j<=eded){
            fak*=j;
            j++;
        }
        System.out.println("Ededin faktoriali: "+fak);


        int k=1, fakt=1;
        do {
            fakt*=k;
            k++;
        }while(k<=eded);
        System.out.println("Ededin faktoriali: "+fakt);

    }

}
