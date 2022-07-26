package Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        int num=0,num1=1,num3;
        System.out.print(num+" "+num1);
        for(int i=2;i<10;i++){
            num3=num+num1;
            System.out.print(" "+num3);
            num=num1;
            num1=num3;
        }

    }
}
