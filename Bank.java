//BHOOMI BISHT 2400320100366
import java.util.Scanner;

class BankAccount {
    private String accHolder;
    private int accNo;
    private double balance;

    // Constructor
    BankAccount(String accHolder, int accNo, double balance) {
        this.accHolder = accHolder;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("Bhoomi", 12345, 10000);
        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    account.withdraw(with);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}

