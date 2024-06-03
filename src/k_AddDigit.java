import java.util.Scanner;
public class k_AddDigit {
    public static void main(String args[]) {

        //Taking input from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE :");
        float value = sc.nextInt();
        System.out.print("ENTER THE K VALUE :");
        float K = sc.nextInt();

        for(float num=1; num<=value; num++){
            float sum=0;
            for(float reminder=num; reminder>0; reminder/=10){
                sum+=reminder%10;
            }
            if(sum == K){
                System.out.println("The Digit is :-"+num+" The sum of Digit :- "+K);
            }
        }

    }
    }

