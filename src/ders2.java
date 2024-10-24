public class ders2
{

    public static void main(String[] args)
    {
        //data tipleri uzerinde emeliyyatlar
        //Binary operators
        //riyazi- arithmetic operators [+,-,*,/,%]
        int a=100,b=50;
        int c=a+b, d=a-b, e=a*b;
        float f=a/b;
        int q=a%b;
        System.out.println(c+" "+d);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(q);
        //muqayise-comparison operators[>,<,>=,<=,==,!=]
        System.err.println(a>b);
        boolean muqayise=a>b, muqayise2=a==b, muqayise3=a>=b, muqayise4=a!=b;
        System.err.println(muqayise);
        System.err.println(muqayise2);
        System.err.println(muqayise3);
        System.err.println(muqayise4);
        //metnleri muqayisesi
        String ad="Gultac", soyad="Quliyeva";
        System.err.println(ad.equals(soyad));

        //menimsetme-assignment operators [=,+=,-=,*=,/=,%=]
        int yas=10;
        yas+=20;
        System.out.println(yas);

        //mentiqi-logical operators[&&,||,!]
        int a1=88,a2=90;
        boolean mqys=(a1<a2||a1>100);
        System.err.println(mqys);

        //Unary operators- inkrement/dekrement
        int eded=10;
        eded++;
        System.out.println(eded);
        System.out.println(eded++);
        System.out.println(++eded);










    }






}

