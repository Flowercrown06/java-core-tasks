import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
 // task number 1
        /*Scanner sc=new Scanner(System.in);
        System.out.print("PLS,Enter the number; ");
        float number=sc.nextFloat();
        if(number>0){
            System.out.println(number+ " This is a positive number");
        }
        else if(number<0){
            System.out.println(number+ "- This is a negative number");
        }
        else{
            System.out.println(number+ "- This number is equal to zero");
        }*/
 // task number 2
        /*for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }*/
 // task number 3
        /*int sum=0;
        for(int i=1;i<=100; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);*/
 // task number 4
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12; ");
        int number=sc.nextInt();
        String moon= switch (number){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Oops,Wrong choice";
        };
        System.out.println(moon);*/
 // task number 5
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12; ");
        int number=sc.nextInt();
        String season= switch (number){
            case 1,2,12 -> "Winter";
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11 -> "Autumn";
            default -> "Oops,Wrong choice";
        };
        System.out.println(season);*/
 // task number 6
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur score,pls; ");
        float score= sc.nextFloat();
        if(score>=0 && score<=50){
            System.out.println("Congrats, you failed the exam;(");
        }
        else if(score>=51 && score<=60){
            System.out.println("E");
        }
        else if(score>=61 && score<=70){
            System.out.println("D");
        }
        else if(score>=71 && score<=80){
            System.out.println("C");
        }
        else if(score>=81 && score<=90){
            System.out.println("B");
        }
        else if(score>=91 && score<=100){
            System.out.println("A");
        }
        else{
            System.out.println("Wrong entry");
        }*/
 // task number 7
        /*int j=0;
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                j++;
            }
        }
        System.out.println(j);*/
 // task number 8
        /*int number,sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number; ");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println(sum);*/
 // task number 9
        /*Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number,pls; ");
        int num= sc.nextInt();
        String str= String.valueOf(num);
        int b, sum=0;
        for(int i=0; i<str.length(); i++){
            b=num%10;
            num/=10;
            sum+=b;
        }
        System.out.println("sum= "+sum);*/
    }
}
