package exercise8.task1;

public class Runner {
    
    public static void main(String[] args) {
        
        Bank fakeBank = new Bank();
        fakeBank.addBankAccount(11.50, "Rob");
        fakeBank.addBankAccount(101.50, "Becs");
        fakeBank.addBankAccount(111.50, "Lily");

        fakeBank.displayBankAccountBalances();
    }
}
