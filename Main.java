import java.sql.Connection;

public class Main {

    public static void main(String args[]) {

        try {
            Bank obj = new Bank();
            try {

                obj.createAccount("2721300", "Yadav", 20000);
                obj.createAccount("2721370", "Yadav", 20000);
                obj.createAccount("2721317", "Aman", 30000);
                obj.createAccount("909182", "Kumar", 70000);
                obj.createAccount("909182", "Kumar", 70000);
                System.out.println("*************************");
                System.out.println("*************************");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Duplicate Entry Error, Account Number shouldn't be duplicate");
            }

            // obj.showAll();

            try {

                obj.getAccount("2721370").deposit(2000);
                obj.getAccount("2721317").deposit(5000);
                obj.getAccount("211222").deposit(9000);

            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }

            BankAccount user = null;
            try {

                user = obj.getAccount("2721370");
                try {
                    user.withdraw(3000);
                    System.out.println("Withdrawal successful for 2721370");
                    System.out.println("-----------------------");
                } catch (InsufficientFundsException | InvalidAmountException e) {
                    // TODO Auto-generated catch block
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }

            try {

                obj.transferFunds("2721370", "2721317", 9000);

            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
                ;
            }

            try {

                obj.getTransactionByAccNo("2721370");
                ;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println(e.getMessage());
            }
            ;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ;

        // try {
        // Connection con = DatabaseConnection.getConnection();
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // System.out.println(e.getMessage());
        // }

    }

}
