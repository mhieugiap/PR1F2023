package Tutorial.TUT6.Activity1;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;

public class BankAccount {
    String holderName;
    double interestRate;
    double balance;
    int transactions;

    //constructor
    public BankAccount(double initial, double interestRate, String holderName) {
        this.holderName = holderName;
        this.interestRate = interestRate;
        this.balance = initial;
        this.transactions = 1;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions++;
    }

    public void monthlyFee() {
        this.withdraw(10);
    }

    public void annualInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }

    public String toString() {
        String output = holderName + ", ";
        if (balance < 0) {
            output += "-$" + String.format("%.2f", -balance);
        } else
            output += "$" + String.format("%.2f", balance);
        return output;
    }

    public void transfer(BankAccount receiver, double amount) {
        double total = amount + 0.5;
        if (balance < total) {
            System.out.println("Balance is not enough to transfer $" + amount + " to " + receiver.holderName);

        } else {
            this.withdraw(total);
            receiver.deposit(amount);
            System.out.println("Successfully transfer $" + amount + " to " + receiver.holderName + " with $0.5 fee.");
        }
    }


}
