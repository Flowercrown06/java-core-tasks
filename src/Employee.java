public class Employee {
    String ad;
    String ixtisas;
    int tecrube;
    int maas;

    public Employee() {

    }

    public Employee(String ad, String ixtisas, int tecrube, int maas) {
        this.ad = ad;//" "
        this.ixtisas = ixtisas;
        this.tecrube = tecrube;
        this.maas = maas;
    }


       /* public String toString () {
            return "Employee{" + "ad=' " + ad + '\'' + ", ixtisas=' " + ixtisas + '\'' + ", maas=" + maas + ", tecrube=" + tecrube + '}';
        }*/




    public static void main(String[] args) {
        Employee hekim = new Employee("Afaq", "cerrah", 17, 4000);
        Employee muellim = new Employee("Aliye", "riyaziyyat muellimliyi", 3, 600);
        Employee IT = new Employee("Gulten", "IT mutexessisi", 10, 4000);
        Employee muhendis = new Employee("Gunes", "komputer muhendisliyi", 7, 1500);
        Employee ressam = new Employee("Gulsen", "ressam", 6, 600);
        Employee huquqsunas = new Employee("Ayten", "huquqsunas", 30, 4000);
        Employee polis= new Employee("Anar","polis",9,2000);

        Employee[] isciler = {hekim, muellim, IT, muhendis, ressam, huquqsunas, polis};
        Employee maxMaasliIsci = isciler[0];
        for(int i=0; i<isciler.length; i++){
            if (isciler[i].maas > maxMaasliIsci.maas) {
                maxMaasliIsci = isciler[i];

            }
        }
        for (int i=0; i<isciler.length; i++){
            if(maxMaasliIsci.maas==isciler[i].maas){
                System.out.println("En cox maas alan isci(ler)in ad(lar)i; "+isciler[i].ad);
            }
        }
        System.out.println("En cox maas alan iscinin maasi;  "+maxMaasliIsci.maas);
       /* Employee IT=new Employee();
        IT.ad="Gultac";
        Employee hekim=new Employee("Gulsen", "hekim", 5, 5000 );
        Employee muellim=new Employee("Gulnar","muellim", 4,300);

        Employee[] array={hekim, muellim};
        for(int i=0; i<array.length; i++){
            System.out.println(array.ToString());
        }

        //isciler arrayi yarat en mex maas alan isci
        //kolklyator
*/



    }
}
