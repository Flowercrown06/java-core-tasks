//--------
//Array- elementlərini artan istiqamərdə düzən metod yaradın.
import java.util.Arrays;
public class Method5 {
    public static void main(String[] args) {
        int arr[]={1,8,6,0,5,7,3};
        int a=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                a=arr[i];
                arr[i]=arr[arr.length-1];
                arr[arr.length-1]=a;
            }
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
}
