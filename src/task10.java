import java.util.Scanner;
import java.util.Vector;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vec = new Vector<>();
        Vector<Integer> eks = new Vector<>();
        vec.add(1);
        vec.add(7);
        vec.add(10);
        vec.add(12);
        vec.add(13);
        System.out.println("Ededi daxil edin; ");
        int eded = sc.nextInt();
        int qaliq = eded % 5;
        for(int i=0;i<5;i++){
            eks.set((i+qaliq)%5, vec.get(i) );}
    /*int a = vec.get(i);
    int index = (qaliq + i)%5;
            eks.set(index, a);
        }*/
//        if(eded % 5 == 0){
//            eks.add(0,vec.get(0));
//            eks.add(1,vec.get(1));
//            eks.add(2,vec.get(2));
//            eks.add(3,vec.get(3));
//            eks.add(4,vec.get(4));
//        }
//        else if( eded % 5 == 1){
//            eks.add(0,vec.get(4));
//            eks.add(1,vec.get(0));
//            eks.add(2,vec.get(1));
//            eks.add(3,vec.get(2));
//            eks.add(4,vec.get(3));
//        }
//        else if( eded % 5 == 2){
//            eks.add(0,vec.get(3));
//            eks.add(1,vec.get(4));
//            eks.add(2,vec.get(0));
//            eks.add(3,vec.get(1));
//            eks.add(4,vec.get(2));
//        }
//        else if( eded % 5 == 3){
//            eks.add(0,vec.get(2));
//            eks.add(1,vec.get(3));
//            eks.add(2,vec.get(4));
//            eks.add(3,vec.get(0));
//            eks.add(4,vec.get(1));
//        }
//        else{
//            eks.add(0,vec.get(1));
//            eks.add(1,vec.get(2));
//            eks.add(2,vec.get(3));
//            eks.add(3,vec.get(4));
//            eks.add(4,vec.get(0));
//        }
        System.out.println(eks);
    }
}