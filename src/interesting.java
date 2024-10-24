import java.util.Arrays;
public class interesting {
    public static void main(String[] args) {
        int[]array=new int[2];
        array[0]=4;
        array[1]=8;
        int a=5;
        System.out.println("a= "+ a);
        System.out.println("massivin 0-ci elemeneti; "+ array[0]);
        System.out.println("massivin 1-ci elemeneti; "+ array[1]);

        changeVariableValue(a);
        changeArrayValue(array);


        System.out.println("---------------------------------------------------------");



        System.out.println("a= "+ a);
        System.out.println("massivin 0-ci elemeneti; "+ array[0]);
        System.out.println("massivin 1-ci elemeneti; "+ array[1]);
    }

    public static void changeVariableValue(int alma){
        alma=10;
    }

    public static void changeArrayValue(int[] alma){
        alma[0]=10;
    }
}
