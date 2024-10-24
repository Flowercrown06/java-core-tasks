public class isciler {
    public static void main(String[] args) {
        //parametrsiz
        Employee jurnalist=new Employee();//constructor metod- un adi clasin adi ile eyni olur,boyuk herfle yazilir, obyekti yaratmaq ucun ist olunur
        jurnalist.ad="Elmar";
        jurnalist.tecrube=5;
        jurnalist.ixtisas="Idman";
        jurnalist.maas=3000;

        //parametrli construktor
        Employee hekim= new Employee("Elmar","hekim",5,5000);
        System.out.println(hekim);
        capEt(hekim);

    }


        public static void capEt(Employee employee){
            System.out.println(employee.ad);
        }


}
