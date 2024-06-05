import java.util.Scanner;

public class DeclaringArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


      int n= sc.nextInt();
      int[] arr = new int[n];
      for (int i=0; i<n; i++){
          arr[i]= sc.nextInt();
      }

      int max_ele=arr[0];
      int min_ele=arr[0];

      for(int i=0;i<n; i++){
          if(arr[i]>max_ele){
              max_ele=arr[i];
          }

          if(arr[i]<min_ele){
              min_ele=arr[i];
          }
      }
        System.out.println("range of array is:"+ (max_ele-min_ele));
    }
}
