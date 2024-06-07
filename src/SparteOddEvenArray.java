import java.util.Scanner;

public class SparteOddEvenArray {
    public static void main(String[] args) {
        Scanner scc =new Scanner(System.in);
        int num= scc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i]= scc.nextInt();
        }
         int even[]=new int[num];
        int odd[] = new int[num];
        int k=0;
        int m=0;

        for(int i=0; i<num; i++){
            if(arr[i]%2==0){
                even[k]=arr[i];
                k++;
            }else{
                odd[m]=arr[i];
                m++;
            }
        }

        for(int i=0; i<k; i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        for(int i=0; i<m; i++){
            System.out.print(odd[i]+" ");
        }
    }
}
