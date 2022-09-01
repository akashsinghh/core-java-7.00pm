package exceptionhandling;

import java.util.Scanner;

public class BankCustomeException {
    public void amount() throws AmountArelessException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter ur amount: ");
        int amount=sc.nextInt();
        if(amount>=5000){
            System.out.println("Show ur amount sufficent :");
        }else {
            throw new AmountArelessException("Your bank account money is not sufficent :");
        }
    }

    public static void main(String[] args) {
        BankCustomeException obj=new BankCustomeException();
        try{
            obj.amount();
        }catch (Exception e){
            System.out.println("Error ocuured : "+e);
        }
    }
}
