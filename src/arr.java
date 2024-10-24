/*import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String eded=scanner.nextLine();

      //  int[]arr={1,3,5,7};
        String[]arr={"salam","necesen","fgh"};


        for(int i=0;i<arr.length; i++){
            if (eded.equals(arr[i])){
                System.out.println("Daxil etdiyiniz eded massivde var");
                break;

            }
            else{
                System.out.println("Daxil etdiyiniz eded massivde yoxdur");



            }
        }

    }
}
*/
import java.util.Scanner;
 public class arr{
     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.print("Sozu enter et ");
         String soz= sc.nextLine();
         int a =0;
         String [] arr= {"Sevda", "Sema", "Sakit","Senem", "Sadiq"};
         for (int i=0; i<arr.length; i++){
             if(soz.equals(arr[i])){
                 System.out.println(("Soz massivde var"));
                 break;
             }
             else{
                 a++;
             }
         }
         if (a==arr.length){
             System.out.println("yoxdur");
         }
     }
 }