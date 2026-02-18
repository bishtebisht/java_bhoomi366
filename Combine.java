class insufficientBalanceException extends Exception {
    //constructor
    public insufficientBalanceException(String message) {
        //super-> call the constructor of the parent class (Exception) to set the error message
        super(message);
    }
}
class BankAccount {
    //instance variable
    double balance=5000;

    //method to withdraw money 
    //throws keyword is used to declare that this method may throw an exception of type insufficientBalanceException
    void withdraw(double amount) throws insufficientBalanceException {
        if (amount > balance) {
            //user-defined exception is thrown when the withdrawal amount exceeds the available balance
            throw new insufficientBalanceException("Insufficient balance. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
public class Combine {
    public static void main(String[] args) {
        try {
            int a=30, b=0;    
            int c=a/b;  //may throw exception    
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("This block is always executed.");
        }


        BankAccount account = new BankAccount();
        try {
            account.withdraw(6000);
        } catch (insufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    
}
