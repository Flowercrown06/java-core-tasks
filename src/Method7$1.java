import java.util.Scanner;

//İstifadəçidən cümlə daxil etməsini istəyin və
// aşağıdakı iki formada tərsinə çevirən 2 ayrı metod yaradın:
// 1) input : Hello World  , output : World Hello
// 2)  input : Hello World  , output : olleH dlroW
public class Method7$1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence; ");
        String word= sc.nextLine();
        String reverse="",first="" , second="";
        String result=reversesentence(word,first,second,reverse);
        System.out.println(result);

    }

    public static String reversesentence(String word,String first, String second,String reverse){
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
        return reverse;
    }
}
