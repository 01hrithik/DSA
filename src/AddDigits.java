/*
Given an integer num, repeatedly add all its digits until
the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:

Input: num = 0
Output: 0
 */


import java.util.Scanner;

public class AddDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num>=10){
            int sum =0;

            for(int j=num; j>=1; j/=10){
                Math.pow(j,2);
                sum+=j%10;


            }
            num=sum;
        }
        System.out.println(num);


    }
}
