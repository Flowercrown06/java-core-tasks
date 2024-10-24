import java.util.Arrays;
import java.util.Scanner;

public class arrayyaratmaq {
    public static void main(String[] args) {
        System.out.println("Yaratmaq istediyiniz arrayin olcusunu daxil edin ; ");
        Scanner scanner=new Scanner(System.in);
        int olcu= scanner.nextInt();
        int[] arr = new int[olcu];
        for(int i=0; i<olcu; i++){
            System.out.println("Arrayin "+i+"-ci elementini daxil edin ; ");
            int element= scanner.nextInt();
            arr[i]=element;
        }
        System.out.println(Arrays.toString(arr));

        for(int i: arr){
            System.out.println(i);
        }
    }
}


        /*int twoDimArray[][] = new int[3][4];
        twoDimArray[0][0] = 5;//write the value 5 into the cell at the intersection of the zero row and zero column
        twoDimArray[0][1] = 7; //write the value 7 into the cell at the intersection of the zero row and the first column
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        System.out.println(Arrays.deepToString(twoDimArray));*/
        /*int [][]arr={{0,1,2},{2,4,5},{2,7,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(arr));*/

