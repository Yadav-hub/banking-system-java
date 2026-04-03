import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Bank {

    HashMap<String, BankAccount> account = new HashMap<>();
    HashSet<String> accountNumber = new HashSet<>();

    

    public void createAccount(String accNo, String name, double intialDeposit) throws InvalidAmountException {

        if (accountNumber.contains(accNo)) {
            System.out.println("Already exists account number " + accNo);
            System.out.println("Can't Add duplicate account number");
        } else {
            BankAccount bankAccount = new BankAccount(accNo, name, intialDeposit);
            account.put(accNo, bankAccount);
            accountNumber.add(accNo);
        }

    }

    public void showAll() {
        Collection<BankAccount> banks = account.values();

        for (BankAccount bank : banks) {
            System.out.println("Account Number : " + bank.getAccountNumber());
            System.out.println("Name : " + bank.getAccountHolderName());
            System.out.println("Balance : " + bank.getBalance());
            System.out.println("----------------------");
            // System.out.println(bank.printStatement());
        }
        
    }

    public BankAccount getAccount(String accNo) throws Exception {

        BankAccount bankUser = account.get(accNo);

        if (bankUser == null) {
            throw new Exception("No user Found");
        }

        return bankUser;
    }

    

    public void transferFunds(String fromAcc, String toAcc, double Amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (!account.containsKey(toAcc)) {
            System.out.println("Creditor Account Number is not valid");
        } else if (!account.containsKey(fromAcc)) {
            System.out.println("Debtor Account Number is not valid");
        } else {
            BankAccount toAccount = account.get(toAcc);
            BankAccount fromAccount = account.get(fromAcc);
            fromAccount.withdraw(Amount);

            toAccount.deposit(Amount);

            System.out.println("Transfer Successful !");
            System.out.println(fromAcc + " to " + toAcc + " : " + Amount);
            System.out.println("Remaining Balance in " + fromAcc + " : " + fromAccount.getBalance());

            System.out.println("-----------------------");
        }

    }
}