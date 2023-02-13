package Functions;

public class PalindromNum {
    static boolean isPalindrom(int number){
        int temp=number, reverseNum=0, lastNum;
        while(temp!=0){
            lastNum=temp%10;
            reverseNum=(reverseNum*10)+lastNum;
            temp/=10;
        }
        if(number==reverseNum){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(988));

    }
}
