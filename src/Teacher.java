public class Teacher {
    /*public static void main(String [] args){
        int a=9, b=9;
        while(a<15){
            System.out.println(a);
            a=a+3;
        }

        do{
            System.out.println(b);
            b=b+3;
        }
        while(b<15);

        switch(a){
            case 2:
                System.out.println("a");
                break;
            case 12:
                System.out.println("b");
                break;
            case 9:
                System.out.println("c");
                break;
            case 15:
                System.out.println("e");
                break;
            default:
                System.out.println("d");
        }
    }*/
   /* public static void main(String []args){
        hesabla(4);

    }
    static void hesabla(int x){
        int netice=x+5;
        System.out.println(netice);
    }*/
  /*  public static void main(String[] args) {  //overload
        System.out.println(cem(3,4,5));
        System.out.println(cem(3,4,6.0,6));
        System.out.println(cem(5,4));

    }
    public static int cem(int a, int b){
        return a+b;
    }
    public static int cem(int a, int b, int c){
        return a+b+c;
    }
    public static double cem(int a, int b, double c, int d){
        return a+b+c+d;
    }*/

   /* //faktorial
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int eded= sc.nextInt();
        int s=1,i=1;
        do{
            s*=i;
            i++;
        }
        while(i<=eded);
        System.out.println(s);
    }*/
     String name;
     String surname;
     String field;
     int age;
     int expeience;
     float salary;

     public static void main(String[]args){
        /* Teacher history=new Teacher();
         history.name="Aylin";
         history.surname="Ayxhanov";
         history.field="History teacher";
         history.age=25;
         history.expeience=2;
         history.salary= 500;*/

         Teacher mathematics=new Teacher("Anar","Agayev","math",30,5,700);
         Teacher geography=new Teacher("DHHD","dD","df",4,3,600);
         Teacher[]list={mathematics,geography};
         Teacher maxsalary=list[0];
         for(int i=0;i<list.length;i++){
             if (maxsalary.salary<list[i].salary){
                 maxsalary=list[i];

             }
         }
         System.out.println(maxsalary.salary);
     }
    /*public Teacher(){

    }*/
     public Teacher(String name, String surname, String field, int age, int expeience, float salary){
         this.name=name;
         this.surname=surname;
         this.field=field;
         this.age=age;
         this.expeience=expeience;
         this.salary=salary;


     }





}


