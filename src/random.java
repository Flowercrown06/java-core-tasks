import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100);
        //int num=(int) (Math.random() * 100);
        System.out.println(num);
    }
}
