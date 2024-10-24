import java.util.Arrays;
//Array-dən Dublikatları silən metod yaradın
public class Array6 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,3,2,5,6,4,7};
        int [] newarr= {};
        int k=0;
        int element= arr[0];
        for(int i=1;i<arr.length;i++){
            if(element==arr[i]){
                newarr[k++]=arr[i];
                continue;
            }

        }

    }
}
