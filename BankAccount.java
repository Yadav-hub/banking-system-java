/*
BankAccount class

Fields — accountNumber, accountHolderName, balance
Methods —

deposit(double amount) — add money, throw exception if amount ≤ 0
withdraw(double amount) — deduct money, throw exception if insufficient balance or amount ≤ 0
getBalance() — return current balance
printStatement() — print account details nicely
*/

public class BankAccount{

    private String accountNumber;

    private String accountHolderName;

    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public String getAccountHolderName()
    {
        return this.accountHolderName;
    }
    public double getBalance()
    {
        return this.balance;
    }

    public void deposit(double amount) throws InvalidAmountException
    {
        if(amount <= 0)
        {
            throw new InvalidAmountException("Amount should be grater than 0");
        }
        
        this.balance += amount;

    }

    public void withdraw(double amount) throws InsufficientFundsException , InvalidAmountException
    {
        if(amount <= 0 )
        {
            throw new InvalidAmountException("Invalid Amount to withdraw");
        }
            
            
        if(this.balance < amount)
            // -500 < 0 and  10000 < - 500
        {
            throw new InsufficientFundsException("Insufficient Fund in your account");
        }
        else
        {
            this.balance -= amount;
            
        }
        

    }

    public void printStatement()
    {

        System.out.println("----------------------");
        System.out.println("Account Holder Name : "+this.accountHolderName);
        System.out.println("Account No : "+this.accountNumber);
        System.out.println("balance : "+this.balance);
        System.out.println("----------------------");
        

    }

}