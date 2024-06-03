import java.util.Scanner;

public class IsPowOfTwo {
    public static boolean IspowTwo(int n){
        if(n <= 0){
            return false;
        }
       while(n>1){
           if(n%2==1){
               return false;

           }
           n/=2;
       }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(IspowTwo(16));

    }
}
