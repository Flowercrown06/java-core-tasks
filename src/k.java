public class k {
    public static void main(String[] args) {
        test();
        hesabla(12,34);
        int cavab= vurma(5,6);
        System.out.println(cavab);



        int q=20;
        int s = 30;
        int yekun=malqiyhes(q,s);


    }



    public static void test(){
        System.out.println("test");  // parametr qebul etmir geriye deyer qaytarmir
    }
    public static void hesabla(int a, int b){
        System.out.println("hes neticesi "+(a+b)); //parametr qebul eden geriye deyer qaytarmayan
    }
    public static int vurma(int a, int b){
        return a*b; //parametr qebul eden geriye deyer qaytaran
    }
    public static int malqiyhes(int qiy, int say){
        return qiy*say;
    }


}
