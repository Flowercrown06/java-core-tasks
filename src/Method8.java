import java.util.Scanner;

//Daxil edilən 2 sözün Anagram olub-olmadığını yoxlayan metod yaradın
public class Method8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        int num=0;
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                if(word1.charAt(i)==word2.charAt(j)){
                    num++;
                }
            }
        }
        System.out.println(num);
        if(num>=word1.length() && word1.length()>=word2.length()){
            System.out.println(word1+" and "+word2+" are anagram words");
        }
        else{
            System.out.println(word1+" and "+word2+" are not anagram words");

        }

    }
}
