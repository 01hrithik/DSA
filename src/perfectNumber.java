import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            int fact_sum=0;
            for(int j=1; j<=i-1; j++){
               if(i%j==0){
                   fact_sum+=j;
               }
            }
            if(fact_sum==i){
                System.out.println("is perfect num:-"+i);
            }
        }

    }
}