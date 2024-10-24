import java.util.Scanner;
import java.util.Vector;

public class task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> vec =new Vector<>();
        Vector<Integer> eks =new Vector<>();
        /*  vec.add(1) ;
        vec.add(7);
        vec.add(10);
        vec.add(12);
        vec.add(13);
        //6  13,1,7,10,12      1,6,11,16
        //5  1,7,10,12,13      5,10,15,20..
        //4  7,10,12,13,1  0-1, 1-2, 2-3, 3-4, 4-0
        //3  10,12,13,1,7  0-2, 1-3, 2-4, 3-0, 4-1
        //2  12,13,1,7,10  0-3, 1-4, 2-0, 3-1, 4-2
        //1  13,1,7,10,12  0-4, 1-0, 2-1, 3-2, 4-3
        int eded=sc.nextInt();
        for(int i=0; i<vec.size();i++){
            if(eded%5==1){
                eks.get(i)=vec.get(5);
            }
            if(eded%5==2){
                eks.get(i)=vec.get(5);
            }


        }


        vec.get(0)=vec.get(3);
        vec.get(1)= vec.get(2);
        vec.get(2)=vec.get(4);//3---0   4---

        */
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            vec.add(a);
        }

            for (int i=0; i<vec.size();i++) {
                if (vec.get(i) % 2 == 0) {
                    System.out.println(vec.get(i));

                } else {
                    System.out.println(vec.get(i) + 1);
                }
            }


            for (int i=vec.size()-1; i>=0;i--){
                System.out.println(vec.get(i));


            }




    }
}
