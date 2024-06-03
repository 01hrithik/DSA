import java.util.Scanner;

public class Dimonad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
            for(int i=1; i<=n; i++){
                  int star=i*2-1;
                  int spec=n-i;

                  for(int j = 1; j<=spec; j++){
                      System.out.print(" ");
                  }
                  for(int j=1; j<=star; j++){
                      System.out.print("*");
                  }
                System.out.println();
            }

            for(int i=1; i<=n; i++){
                int star = 2*(n-i)-1;
                int spec = i;
                for(int j=1; j<=spec; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=star; j++){
                    System.out.print("*");
                }

                System.out.println();
            }

    }
}
