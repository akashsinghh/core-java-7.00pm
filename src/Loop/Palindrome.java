package Loop;

import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the number starting num for print prime number: ");
            int a = scn.nextInt();
            System.out.println("Enter the number end num for print prime number: ");
            int b= scn.nextInt();
            for (int n = a; n <= b; n++) {
                int count = 0;
                for (int div = 2; div <= n/2; div++) {
                    if (n % div == 0) {
                        count++;
                        break;}}
                if (count == 0)
                    System.out.print(" "+n+" ");
            }
        }
    }
//    public static void main(String[] args) {
//        int rem,sum=0 ;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the num");
//        int num=sc.nextInt();
//        int orignalNum=num;
//        while (num!=0){
//            rem=num%10;
//            sum=(sum*10)+rem;
//            num/=10;
//        }
//        if(orignalNum==sum){
//            System.out.println("Palindorme num");
//        }else{
//            System.out.println("Not palindrome num");
//        }


