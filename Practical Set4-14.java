class BankAccount {
    int accNo;
    String name;
    double balance;

    void openAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest: " + (balance * 0.05));
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount() {
        System.out.println("Maturity: " + (balance * 1.1));
    }
}