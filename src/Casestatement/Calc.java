package Casestatement;

import method.Calculator;

import java.util.Scanner;

public class Calc {
    Scanner sc=new Scanner(System.in);

    public  void add(int a,int b){


        int c=a+b;
        System.out.println("Number is added: "+c);

    }public  void sub(int c,int d){


        int e=c-d;
        System.out.println("Number is subtract: "+e);

    }public  void multiply(int c,int d){


        int e=c*d;
        System.out.println("Number is multiply: "+e);

    }public  void divide(int c,int d){


        int e=c/d;
        System.out.println("Number is divide: "+e);

    }public  void square(int num){

        int result=num*num;
        System.out.println("Printing the square: "+" "+result);
    }


    public static void main(String[] args) {
        Calc obj=new Calc();
        obj.add(5,4);
        obj.sub(10,6);
        obj.divide(64,8);
        obj.multiply(5,5);
        obj.square(4);
    }
}
