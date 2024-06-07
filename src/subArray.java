import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        int a[]=new int[num];
 for(int i=0; i<num; i++){
     a[i]=sc.nextInt();
 }
        for(int i=0; i<num; i++){
            for(int j=i; j<num; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
