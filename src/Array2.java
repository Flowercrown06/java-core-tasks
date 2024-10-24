//Array-də tək ədədlərin cəmini, cüt ədədlərin hasilini tapan metod yaradın

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,1,6};
        int[] output2= new int[2];
        int sum=0;
        int product=1;
        output2=calculate(arr,sum,product);
        for(int i:output2){
            System.out.println(i);
        }
    }
    public static int[] calculate (int[] arr, int sum, int product){
        for(int i:arr){
            if(i%2==0){
                product*=i;
            }
            else{
                sum+=i;
            }
        }
        int []output={product,sum};
       // System.out.println("The product of even numbers is "+ product);
       // System.out.println("The sum of odd numbers is "+ sum);
        return output;

    }

}
