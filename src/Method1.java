import java.util.Scanner;

//İstifadəçidən bir söz alın və onu tərsinə çevirən metod yaradın
public class Method1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word; ");
        String word=sc.nextLine();
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);
    }
}
