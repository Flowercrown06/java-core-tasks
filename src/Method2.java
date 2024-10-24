import java.util.Scanner;
//?
//İstifadəçinin daxil etdiyi cümlədə sözlərin sayını tapan metod yaradın
public class Method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence; ");
        String sentence=sc.nextLine();
        int quantity=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                quantity++;
            }
        }
        System.out.println(quantity+1);
    }
}
//s.split(" ");