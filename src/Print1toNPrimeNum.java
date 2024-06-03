import java.util.Scanner;

public class Print1toNPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

      for(int number=1; number<=num; number++){
          System.out.print("number is :-"+number+" is :-");
          if(number <= 1){
              System.out.println("not prime");
          }else{
              int flag=0;
              for(int i=2; i<=number-1; i++){
                  if(number%i==0) {
                      flag=1;
                      break;
                  }
              }
              if(flag==0){
                  System.out.println("prime");
              }else{
                  System.out.println("not prime");
              }
          }
      }

    }
}
