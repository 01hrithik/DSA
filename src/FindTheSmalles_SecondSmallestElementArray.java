import java.util.*;
public class FindTheSmalles_SecondSmallestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");
        }
int min_ele = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min_ele){
                min_ele=arr[i];
            }
        }
        System.out.println();
        int sec_ele=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==min_ele)
                continue;

            if(arr[i]<sec_ele)
                sec_ele=arr[i];


        }
        if(sec_ele ==Integer.MAX_VALUE){
            sec_ele=-1;
            min_ele=-1;
        }
        System.out.println(min_ele);
        System.out.println(sec_ele);
    }
}
