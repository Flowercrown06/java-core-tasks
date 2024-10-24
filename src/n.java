public class n {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i%2==3){
                System.out.print(i);
                break;
            }
            System.out.print(i);
            if(i%2==1){
                continue;
            }
            System.out.print(i);
        }
    }
}
