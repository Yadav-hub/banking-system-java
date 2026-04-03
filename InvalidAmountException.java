public class InvalidAmountException extends Exception {
    
    public InvalidAmountException(String message)
    {
        super(message);
    }
}

/*

InvalidAmountException — when amount is 0 or negative

*/