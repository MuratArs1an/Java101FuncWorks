package Functions;
import java.util.Scanner;

public class Calculator {
    static int sum(int a, int b){
        int result=a+b;
        System.out.println(result);
        return result;
    }
    static int minus(int a, int b){
        int result=a-b;
        System.out.println(result);
        return result;
    }
    static int times(int a, int b){
        int result=a*b;
        System.out.println(result);
        return result;
    }
    static double divide(double a, double b){
        if(b==0){
            System.out.println("Tanimsiz Deger");
            return 0;
        }
        double result=a/b;
        System.out.println(result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result*=a;
        }
        System.out.println(result);
        return result;
    }
    static int mod(int a, int b){
        return a%b;
    }
    static void rectangle(int a, int b){
        int area=a*b;
        int meter=2*(a+b);
        System.out.println("Alani: "+area+"\n"
        +"Cevresi: "+meter);
    }
    public static void main(String[] args) {
        int choise;
        Scanner input=new Scanner(System.in);
        String menu="1-Toplama\n"
                +"2-Cikarma\n"
                +"3-Carpma\n"
                +"4-Bolme\n"
                +"5-Uslu Sayi Hesaplama\n"
                +"6-Mod Alma\n"
                +"7-Dikdortgen Alan ve Cevre Hesaplama\n"
                +"0-Cikis Yap";
        System.out.println(menu);
        while(true) {
            System.out.println("Yapmak Istediginiz islemi seciniz");
            choise = input.nextInt();
            if(choise==0 || choise>7){
                System.out.println("Cikis Yapildi");
                break;
            }
            int a, b;
            System.out.println("ilk degeri giriniz");
            a = input.nextInt();
            System.out.println("Ikinci Degeri giriniz");
            b = input.nextInt();
            switch (choise) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    System.out.println(mod(a,b));
                    break;
                case 7:
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz");
                    break;
            }

        }
    }
}
