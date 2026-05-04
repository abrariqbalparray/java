class BankAccount {
    int accNo;
    double balance;

    BankAccount(int acc, double bal) {
        accNo = acc;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if(balance < amt)
            System.out.println("Insufficient balance");
        else
            balance -= amt;
    }

    void interest() {
        balance += balance * 0.05;
    }
}