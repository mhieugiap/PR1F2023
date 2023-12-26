package Tutorial.TUT6.Activity1;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(300, 6.5, "Hieu");
        BankAccount acc2 = new BankAccount(200, 6, "Minh");
//        BankAccount2 acc3 = new BankAccount2("John", 10, 6.9);
        acc1.deposit(60);
        acc1.withdraw(100);
        acc1.annualInterest();
        acc1.monthlyFee();
        acc1.transfer(acc2, 20);
        System.out.println(acc1.toString());
    }
}
