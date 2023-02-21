import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();
    private Transaction transaction = new Transaction();

    /**
     * Deposit method.
     * 
     * @param amount - amount
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
            this.transaction = new Transaction("Nap tien", amount, this.balance);
        }
    }

    /**
     * WithDraw method.
     * 
     * @param amount - amount
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            this.transaction = new Transaction("Rut tien", amount, this.balance);
        }
    }

    /**
     * Add transaction method.
     * 
     * @param amount    - amount
     * @param operation - operation
     */
    public void addTransaction(double amount, String operation) {
        if (operation == "deposit") {
            deposit(amount);
            this.transitionList.add(this.transaction);
        } else if (operation == "withdraw") {
            withdraw(amount);
            this.transitionList.add(this.transaction);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print transactions method.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction trans : this.transitionList) {
            System.out.printf("Giao dich %d: ", i);
            System.out.printf("%s ", trans.getOperation());
            System.out.printf("$%.2f. ", trans.getAmount());
            System.out.printf("So du luc nay: $%.2f.\n", trans.getBalance());
            i++;
        }
    }

    /**
     * Main.
     * 
     * @param args - arguments
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}