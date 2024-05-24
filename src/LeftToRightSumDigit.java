import java.util.Scanner;
public class LeftToRightSumDigit {
    public static void main(String args[]){
        //Taking input from User.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the left side Number :-");
        int left = sc.nextInt();
        System.out.print("Enter the rigth side Number :-");
        int rigth = sc.nextInt();

        for(int num=left; num<=rigth; num++){
            int sum = 0;
            for(int reminder=num; reminder>=1; reminder/=10){
                sum+=reminder%10;
            }
            System.out.println("LEFT TO RIGHT NUMBER :-"+num+" THE SUM OF  DIGIT :-"+sum);
        }


    }
}
