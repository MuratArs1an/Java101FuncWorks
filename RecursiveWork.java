package Functions;
import java.util.Scanner;

public class RecursiveWork {
    static void handler(int num, int num2){
        if(num>0){
            System.out.println(num);
            handler(num-5,num2);
        }
        if(num<=0){
            handler2(num, num2);
        }
    }
    static void handler2(int num,int num2){
        if(num<=num2){
            System.out.println(num);
            handler2(num+5,num2);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Bir Sayi giriniz : ");
        num=input.nextInt();
        int num2=num;
        handler(num,num2);
    }
}
