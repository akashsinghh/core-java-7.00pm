package exceptionhandling;

import java.util.Scanner;

public class Demoexception1 {
    public void divide(){
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter the first num for divide: ");
        int num= sc.nextInt();
        System.out.println("please enter the second num for divide: ");
        int num2= sc.nextInt();
        try{
            int divid=num/num2;
            System.out.println("Your output is : "+divid);
        }catch (Exception e){
            System.out.println("if you divide by 0 ur answer showing error: ");
        }
        finally {
            System.out.println("They Finally keyword always run: ");
        }

    }

    public static void main(String[] args) {
        Demoexception1 obj=new Demoexception1();
       obj.divide();
    }

}
