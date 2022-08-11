package Casestatement;



import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter ur name:" );
       String name= obj.nextLine();

        Scanner obj2=new Scanner(System.in);
        System.out.print("enter ur age:");
        int age=obj2.nextInt();
        System.out.println("Printed name:"+name);
        System.out.println("printed age: " +age);


    }



}
