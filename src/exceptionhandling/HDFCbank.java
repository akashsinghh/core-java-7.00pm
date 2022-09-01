package exceptionhandling;

import java.util.Scanner;

public class HDFCbank implements Bank {
    public double balance;
    @Override
    public void deposite(double amount) throws InvalidAmountException {
        if (amount >= 0) {
            throw new InvalidAmountException(amount + "IS not valid: ");
        }
        balance = balance + amount;
    }
    @Override
    public double withdrawl(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("insufficent fund:");
        }
        balance = balance - amount;
        return amount;
    }
    @Override
    public void balanceEnquiry() {
        System.out.println("current balance=" + balance);
    }
//    public double interset(){
//
//    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            HDFCbank obj = new HDFCbank();
            String option = "";
            do {
                System.out.println("1. DEPOSITE");
                System.out.println("2. WITHDRAW");
                System.out.println("3. BALANCE ENQUIRY");
                System.out.println("ENTER OPTION");
                option = sc.next();
                switch (option) {
                    case "1": {
                        System.out.println("ENTER DEPOSIT AMOUNT");
                        double amt = sc.nextDouble();
                        obj.deposite(amt);
                        obj.balanceEnquiry();
                        break;
                    }
                    case "2": {
                        System.out.println("ENTER WITHDRAW AMOUNT");
                        double amt = sc.nextDouble();
                        double wd = obj.withdrawl(amt);
                        System.out.println("WITHDRAW AMOUNT IS :" + wd);
                        obj.balanceEnquiry();
                        break;
                    }
                    case "3": {
                        obj.balanceEnquiry();
                        break;
                    }
                    default:
                        System.out.println("INVALID OPTION");
                }
                System.out.println("DO YOU WANT TO CONTINUE (YES/NO)");
                option = sc.next();
            }
            while (option.equalsIgnoreCase("YES"));

        }
        catch (InvalidAmountException iae)
        {
            System.out.println (iae.getMessage ());
        }
        catch (InsufficientFundsException ife)
        {
            System.out.println (ife.getMessage ());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println (nfe.getMessage ());
        }

    }
    }


