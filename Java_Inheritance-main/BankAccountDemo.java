package pillars.Inheritance;
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("456", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("789", 25000, 12);

        sa.displayDetails();
        sa.displayAccountType();
        System.out.println();

        ca.displayDetails();
        ca.displayAccountType();
        System.out.println();

        fda.displayDetails();
        fda.displayAccountType();
    }
}
