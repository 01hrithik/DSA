import java.util.Scanner;
public class IsPrimeNumber {
    public static void main(String[] args) {
        //taking input from user.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :-");
        int value = sc.nextInt();

        boolean isprime=true;
        for(int i=2; i<=value-1; i++){
            if(value%i==0){
                isprime = false;
                break;
            }
        }
        System.out.println(isprime);
    }
}
