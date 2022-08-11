package Casestatement;

import java.util.Scanner;




import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char oper;
        int num1,num2,ans;
        Scanner sc=new Scanner(System.in);
        //enter operator
        System.out.println("choose operator: +,-,*,or /");
        oper=sc.next().charAt(0);
        //enter the num
        System.out.println("Enter the first number: ");
        num1= sc.nextInt();
        //second num
        System.out.println("enter the second num: ");
        num2=sc.nextInt();

        switch (oper){
            case '+':
                ans=num1+num2;
                System.out.println(ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.println(ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.println(ans);
                break;
            default:
                System.out.println("Invalid number :");
                break;
        }






    }
}
