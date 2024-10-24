import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int count=0;
      for(int i=3; i<=100; i++){
          count=0;
          for(int j=2; j<i/2; j++){
              if(i%j==0){
                  count++;

              }
          }
          if(count>0){
              System.out.println(i+" Murekkeb ededdir");
          }
          else{
              System.out.println(i+" sade ededdir");
          }
      }
        System.out.println();*/
        /*System.out.println("Enter the first number; ");
        float first=sc.nextFloat();
        System.out.println("Enter the second number; ");
        float second=sc.nextFloat();
        System.out.println("1:'+'\n 2:'-'\n 3:'*'\n 4:'/'");
        System.out.println("Enter the operator; ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("first+second="+(first+second));
                break;
            case 2:
                System.out.println("first-second="+(first-second));
                break;
            case 3:
                System.out.println("first*second="+(first*second));
                break;
            case 4:
                if(second!=0){
                    System.out.println("first/second="+(first/second));
                }
                else{
                    System.out.println("0-a bolmek olmur");
                }
                break;
            default:
                System.out.println("Emeliyyat movcud deyil");
        }*/

       /* System.out.println("Saniyeni daxil edin: ");
        int vaxt=sc.nextInt();
        int saat=vaxt/3600;
        int a=vaxt%3600;
        int deq=a/60;
        int san=a%60;
        System.out.println(saat+" saat "+deq+" deqiqe "+san+" saniye");*/
        /*System.out.println("Ededi daxil edin: ");
        int eded=sc.nextInt();
        int P=1;
        for(int i=1;i<=eded;i++){
            P*=i;
        }
        System.out.println("Ededin faktoriali: "+P);*/

        /*int eded=sc.nextInt();
        String a=String.valueOf(eded);
        int b=a.length();
        int ters = 0;
        for ( int i=0; i<b; i++){
            ters = 10 * ters + eded % 10;
            eded /= 10;}
        System.out.println("Ededin tersi: "+ ters);*/
       /* int num=sc.nextInt();
        int times=sc.nextInt();
        for(int i=1;i<=times;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }*/

        /*int n=0;
        int sum=0;
        System.out.println("Enter a num; ");
        n=sc.nextInt();
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);*/

       /* int age=sc.nextInt();
        if(age<0){
            System.out.println("yanlis input");
        }
        else if(age>0 && age<=12){
            System.out.println("usaq");
        }
        else if(age>=13 && age <30){
            System.out.println("genc");
        }
        else if(age>=30 && age<=59){
            System.out.println("yrtkin");
        }
        else{
            System.out.println("yasli");
        }*/

       /* System.out.println("Sozu daxil edin; ");
        String soz=sc.nextLine();
        String ters="";
        for (int i=soz.length()-1; i>=0; i--){
            ters+=soz.charAt(i);
        }
        if(soz.equals(ters)){
            System.out.println("Soz polindromdur");
        }
        else{
            System.out.println("Soz polindrom deyil");
        }*/
       /* float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        String muqayise;
        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    muqayise = "num1>num2>num3";
                    System.out.println(muqayise);
                } else {
                    muqayise = "num1>num3>num2";
                    System.out.println(muqayise);

                }
            } else {
                muqayise = "num1>num1>num2";
                System.out.println(muqayise);
            }
        } else if (num1 < num3) {
            if (num2 < num3) {
                muqayise = "num3>num2>num1";
                System.out.println(muqayise);
            } else {
                muqayise = "num2>num3>num1";
                System.out.println(muqayise);
            }


        }*/
       /* int sum=0;
        while(sum<100){
            System.out.println("Enter the num; ");
            int num= sc.nextInt();
            sum+=num;
        }
        System.out.println(sum);*/

       /* int num=sc.nextInt();
        String str= switch (num) {
            case 1 -> "January- 31 days";
            case 2 -> "February-28 days";
            case 3 -> "March-31 days";
            case 4 -> "April-30 days";
            case 5 -> "May-31 days";
            case 6 -> "June-30 days";
            case 7 -> "July-31 days";
            case 8 -> "August-31 days";
            case 9 -> "September- 30 days";
            case 10 -> "October-31 days";
            case 11 -> "November-30 days";
            case 12 -> "December-31 days";
            default -> "Oops,Wrong choice";
        };
        System.out.println(str);*/


       /* float num= sc.nextFloat();
        int number=(int)num;
        float k=num-number;
        System.out.println(number+","+ k);*/

        char ch=128;
        System.out.println(ch);

    }
}