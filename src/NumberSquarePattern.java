import java.util.Scanner;

public class NumberSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col=sc.nextInt();
        int row =sc.nextInt();

        for(int i=1; i<=row; i++){

            for(int j=i; j<=col+i-1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
