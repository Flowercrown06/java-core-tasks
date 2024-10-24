public class Ucbucaq{
    int a,b,c;
    public void sahe(){
        int p=(a+b+c)/2;
        double sahe=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Terefleri "+ a+", "+b+", "+c+" olan ucbucagin sahesi: " + sahe);
    }


    public static void main(String[] args) {
        Ucbucaq ob=new Ucbucaq();
        ob.a=3;
        ob.b=4;
        ob.c=5;
        ob.sahe();
    }

}


