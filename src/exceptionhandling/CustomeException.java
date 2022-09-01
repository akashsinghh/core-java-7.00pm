package exceptionhandling;

import java.util.Scanner;

public class CustomeException {
    public void doVoting() throws AgeNotElligibleException   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter ur age: ");
        int age= sc.nextInt();
        if (age>=18){
            System.out.println("Welcome to voting :  "+age);
        }else {
            throw new AgeNotElligibleException("Age is less than 18 so u r not eligible for voting sorry: ");
        }
    }

    public static void main(String[] args) {
        CustomeException obj=new CustomeException();
        try{
            obj.doVoting();

        }catch (Exception e){
            System.out.println("Exception occured: "+e);

        }
    }
}
