package exercise8.task1;

/**
 * BankAccount
 */
public class BankAccount {

    // attributes
    private double balance;
    private String name;

    // constructors
    /**
     * @param balance the starting balance of the account
     * @param name the name of the account
     */
    public BankAccount(double balance, String name) {
        setBalance(balance);
        setName(name);
    }

    // methods
    // getters/setters
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    // functions
    /**
     * A method to debit an amount from the current balance.
     * 
     * @param debitAmount the amount to debit from the balance.
     * @throws TransactionException 
     */
    public void debit(double debitAmount) throws TransactionException {

        if (getBalance() < debitAmount) {
            throw new TransactionException("Insufficient funds");
        } else {
            setBalance(getBalance() - debitAmount);
            System.out.println("New Balance: " + getBalance());
        }

    }

    // overrides
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "BankAccount: name= " + name + ", balance="  + balance;
    }

}