public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message)
    {
        super(message);
    }
    
}

/*
InsufficientFundsException — when withdrawal exceeds balance
*/