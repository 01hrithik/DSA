import java.util.Scanner;

public class Rohombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        for(int i=1; i<=n; i++){
            int space=i-1;
            int star=n;

            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
