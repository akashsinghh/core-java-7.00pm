package method;

import java.util.Scanner;

public class Calculator {
    Scanner sc=new Scanner(System.in);

    public  void addd(){
        System.out.println("Enter the  first  add number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second addnumber: ");

        int b= sc.nextInt();

        int c=a+b;
        System.out.println("Number is added: "+c);

    }public  void sub(){
        System.out.println("Enter the  first sub number: ");
        int c=sc.nextInt();
        System.out.println("Enter the second sub number: ");

        int d= sc.nextInt();

        int e=c-d;
        System.out.println("Number is subtract: "+e);

    }public  void multiply(){
        System.out.println("Enter the  first mul number: ");
        int c=sc.nextInt();
        System.out.println("Enter the second mul number: ");

        int d= sc.nextInt();

        int e=c*d;
        System.out.println("Number is multiply: "+e);

    }public  void divide(){
        System.out.println("Enter the  first divide number: ");
        int c=sc.nextInt();
        System.out.println("Enter the second divide number: ");

        int d= sc.nextInt();

        int e=c/d;
        System.out.println("Number is divide: "+e);

    }public  void square(){
        System.out.println("Enter the square num plz: ");
        int num=sc.nextInt();

        int result=num*num;
        System.out.println("Printing the square: "+" "+result);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addd();
        obj.sub();
        obj.divide();
        obj.multiply();
        obj.square();
    }
}
