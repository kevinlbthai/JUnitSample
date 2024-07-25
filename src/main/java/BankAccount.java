public class BankAccount {
    private double balance;
    private double  minimumBalance;
    private boolean isActivate = true;
    private String holderName;

    public BankAccount(double balance, double minBalance) {
        this.balance = balance;
        this.minimumBalance = minBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean isActivate() {
        return isActivate;
    }

    public void setActivate(boolean activate) {
        isActivate = activate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double withdraw(double amount) {
        if(balance - amount > minimumBalance) {
            balance -= amount;
            return balance;
        }
        else {
            throw new RuntimeException();
        }
    }

    public double deposit(double amount) {
        return balance += amount;
    }
}
