package Casestatement;

import java.util.Scanner;

public class Calculatorapp {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int subtract(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int multiply(int a,int b){
        int mul=a*b;
        return mul;
    }
    public double Divide(double a,double b){
        double div=a/b;
        return div;
    }
    public static void main(String[] args) {

        Scanner obj1=new Scanner(System.in);
        System.out.print("Please enter the value of a: ");
        int a=obj1.nextInt();

        System.out.print("please enter the value of b: ");
        int b=obj1.nextInt();

        System.out.println("Please enter ur cboice :1-->add,2->sub,3->mul,4->div,5->square");
        int choice = obj1.nextInt();

        Calculatorapp obj=new Calculatorapp();

        switch (choice){
            case 1:
                System.out.println("Sum : " + (a + b));
                break;
            case 2:
                System.out.println("sub : " + (a - b));

                break;
            case 3:
                System.out.print("mul : " + (a * b));
                break;
            case 4:
                System.out.println("div : " + (a / b));
                break;

            default:
                System.out.println("Not Valid");
        }

        int result=obj.add(a,b);
        System.out.println("Enter the result add: "+result);
        int result1=obj.subtract(a,b);
        System.out.println("Enter the result1 sub: "+result1);
        int result2=obj.multiply(a,b);
        System.out.println("Enter the result mul: "+result2);
        double result3=obj.Divide(a,b);
        System.out.println("Enter the result div: "+result3);

    }

}
