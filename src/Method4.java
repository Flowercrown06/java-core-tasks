//Verilən array-dəki elementləri müəyyən aralıqlara görə qruplaşdıran metod yazın
//(məsələn, [0-10], [11-20], və s.). Hər aralıqda neçə element olduğunu göstərin.
//input {5, 12, 19, 22, 8, 25, 30}  output   [0-10]: 2 element, [11-20]: 3 element, [21-30]: 2 element;
public class Method4 {
    public static void main(String[] args) {
        int arr[] = {5,12,19,22,8,25,30};
        int a=0, b=0, c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0 && arr[i]<=10){
                a++;
            }
            else if(arr[i]>=11 && arr[i]<=20){
                b++;
            }
            else if(arr[i]>=21 && arr[i]<=30){
                c++;
            }
        }
        System.out.println("[0-10]: "+a+" element\n" + "[11-20]: "+b+" element\n"+ "[21-30]: "+c+" element");
    }
}
