package Functions;
import java.util.Scanner;

public class PowerRes {
    static int power(int a, int b){
        if(b==0 || a==1) {
            return 1;
        }
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("taban degeri giriniz");
        a=input.nextInt();
        System.out.println("ust degeri giriniz");
        b=input.nextInt();
        System.out.println(power(a,b));
    }
}
