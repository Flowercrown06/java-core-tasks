import java.util.Scanner;

public class misal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word; ");
        String word= sc.nextLine();
        for(int i=word.length()-1; i>=0; i--){
            System.out.println(word.charAt(i));
        }

    }
}
