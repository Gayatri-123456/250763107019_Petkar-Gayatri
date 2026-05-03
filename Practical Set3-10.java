class BankAccount {
    String name;
    double balance;
    static double interestRate = 5.0;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    static void updateInterest(double rate) {
        interestRate = rate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
    }

    void display() {
        System.out.println(name + " Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Asha", 10000);
        b1.display();
        b1.calculateInterest();

        BankAccount.updateInterest(6.5);
        b1.calculateInterest();
    }
}