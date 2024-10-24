public class arrenboyuk {
    public static void main(String[] args) {
        int[] arr={23,45,54,2,55,2,123,2};
        int boyuk=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>boyuk){
                boyuk=arr[i];
            }
        }
        System.out.println(boyuk);
    }
}

