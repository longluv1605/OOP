public class Transaction {
    /**
     * Private variables.
     */
    private String operation;
    private double amount;
    private double balance;

    /**
     * Public variable.
     */
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Non - params constructor.
     */
    public Transaction() {

    }

    /**
     * 3 params constructor.
     * 
     * @param operation - operation
     * @param amount    - amount
     * @param balance   - balance
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Getter for operation.
     * 
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter for operation.
     * 
     * @param operation - operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Setter for amount.
     * 
     * @return - amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter for amount.
     * 
     * @param amount - amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Getter for balance.
     * 
     * @return - balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter for balance.
     * 
     * @param balance - balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return this.operation + " $" + this.amount + ". So du luc nay: $" + this.balance + ".";
    }

}