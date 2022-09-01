package exceptionhandling;

public class SbiBank implements Bank{
    private double balance;
    @Override
    public void deposite(double amount) throws InvalidAmountException {
        if(amount>1000){
            System.out.println("Show the amoubt: "+amount);
        }else {
            throw new InvalidAmountException("your amount is less than 1000 show please add the money");
        }balance=balance+amount;

    }

    @Override
    public double withdrawl(double amount) throws InsufficientFundsException {

        return 0;
    }

    @Override
    public void balanceEnquiry() throws BankIntersetException {

    }

    public static void main(String[] args) {
        SbiBank obj=new SbiBank();
        try{
            obj.deposite(7000);
        }catch (Exception e){
            System.out.println("showing the error: "+e);
        }
    }
}
