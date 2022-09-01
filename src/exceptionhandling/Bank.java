package exceptionhandling;

public interface Bank  {
    public void deposite(double amount) throws InvalidAmountException;
    public double withdrawl(double amount) throws InsufficientFundsException;
    //public void interset(double amount) throw
    public void balanceEnquiry() throws BankIntersetException;
}
