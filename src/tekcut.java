public class tekcut {
    public static void main(String[] args) {
        int S=0,s=0;
        for(int i=0;i<=20;i++){
            if(i%2==0) {
                S += i;
            }
            if(i%2==1){
                s +=i;
            }
        }
        System.out.println("0-20 arasindaki cut ededlerin cemi; "+S);
        System.out.println("0-20 arasindaki tek ededlerin cemi; "+s);





        int j=0, cem=0, CEM=0;
        while(j<=20){
            if(j%2==0) {
                cem += j;
            }
            if(j%2==1){
                CEM +=j;
            }
            j++;
        }
        System.out.println("0-20 arasindaki cut ededlerin cemi; "+cem);
        System.out.println("0-20 arasindaki tek ededlerin cemi; "+CEM);

        int l=0, cemi=0, CEMI=0;
        do{
            if(l%2==0) {
                cemi += l;
            }
            if(l%2==1){
                CEMI +=l;
            }
            l++;
        }while(l<=20);
        System.out.println("0-20 arasindaki cut ededlerin cemi; "+cemi);
        System.out.println("0-20 arasindaki tek ededlerin cemi; "+CEMI);
    }
}
