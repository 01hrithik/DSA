import java.util.Scanner;

public class tringleParrtern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=i; j<=num; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
