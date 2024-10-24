import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String word2="";
       reverse(word,word2);
    }

    public static String reverse (String word, String word2 ) {
        for(int i=word.length()-1;i>=0;i--){
            word2+=word.charAt(i);
        }
        System.out.println(word2);
        return word2;
    }

}
