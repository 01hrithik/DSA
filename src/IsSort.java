public class IsSort {
    public static void main(String[] args) {
        int N=12;
        int sum=0;
        for(int i=N; i>=1; i/=10){
            sum+=i%10;
        }
        System.out.println(sum);
    }
}
