import java.util.Scanner;

public class Method7$2 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the sentence; ");
            String word= sc.nextLine();
            String reverse="",reverse2="",first="" , second="";
            String result=reversesentence(word,first,second,reverse,reverse2);
            System.out.println(result);

        }

        public static String reversesentence(String word,String first, String second,String reverse,String reverse2){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==' '){
                    for(int j=i;j<word.length()-1;j++){
                        first+=word.charAt(j+1);
                    }
                    break;
                }
                else{
                    second+=word.charAt(i);
                }
            }
            reverse=first+" "+second;
            for(int i=reverse.length()-1;i>=0;i--){
                reverse2+=reverse.charAt(i);
            }
            return reverse2;
    }
}
