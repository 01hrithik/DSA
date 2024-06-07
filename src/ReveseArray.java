import java.util.Scanner;
import java.util.Collections;

public class ReveseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]  = new int[n];

        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int i=0;
        int j=n-1;
       while(i<j){
           //swap
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           //update.
            i++;
            j--;
       }
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        if(n%2==1){
            System.out.println(arr[n/2]);
        }else{
            double ans = (arr[(n-1)/2] + arr[n/2])/2.0;
            System.out.println(ans);
        }
        System.out.println();




    }
}
