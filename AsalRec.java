package Functions;
import java.util.Scanner;
public class AsalRec {
    static boolean asal(int a, int i){
        if (a < 2) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        if (a % i != 0 && a >= i - 1) {
            return true;
        } else {
            if (a % i == 0) {
                return false;
            } else {
                return asal(a, i + 1);

            }

        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=2;
        System.out.println("Bir sayi giriniz");
        int a;
        a=input.nextInt();
        if(asal(a,i)){
            System.out.println("Asal sayidir");
        }else{
            System.out.println("Asal DEGILDIR");
        }
    }
}
