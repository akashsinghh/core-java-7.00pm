package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int rem,sum=0 ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        int orignalNum=num;
        while (num!=0){
            rem=num%10;
            sum=(sum*10)+rem;
            num/=10;
        }
        if(orignalNum==sum){
            System.out.println("Palindorme num");
        }else{
            System.out.println("Not palindrome num");
        }
    }
}
