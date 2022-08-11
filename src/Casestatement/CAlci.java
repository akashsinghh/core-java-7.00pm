package Casestatement;

import java.util.Scanner;

public class CAlci {
    Scanner sc=new Scanner(System.in);
    public void add(int a,int b){
        int c=a+b;

        System.out.println("Add number: "+c);

    }
    public  void  sub(int c,int d){
        if (c<d){
            System.out.println("First number is smaller then second: ");
        }
        else {
            int e=c-d;
            System.out.println("Subtract num: "+e);
        }
    }

    public static void main(String[] args) {
        Calc obj=new Calc();
        obj.add(4,6);
        obj.sub(1,3);
    }



}
