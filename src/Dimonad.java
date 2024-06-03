import java.util.Scanner;

public class Dimonad {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
//            for(int i=1; i<=n; i++){
//                  int star=i*2-1;
//                  int spec=n-i;
//
//                  for(int j = 1; j<=spec; j++){
//                      System.out.print(" ");
//                  }
//                  for(int j=1; j<=star; j++){
//                      System.out.print("*");
//                  }
//                System.out.println();
//            }
//
//            for(int i=1; i<=n; i++){
//                int star = 2*(n-i)-1;
//                int spec = i;
//                for(int j=1; j<=spec; j++){
//                    System.out.print(" ");
//                }
//                for(int j=1; j<=star; j++){
//                    System.out.print("*");
//                }
//
//                System.out.println();

        int star=1;
        int space =n-1;
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }

            System.out.println();
            if(i < n){
                star+=2;
                space--;
            }else{
                star-=2;
                space++;
            }
        }

    }
}
