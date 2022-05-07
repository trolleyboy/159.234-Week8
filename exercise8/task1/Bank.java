package exercise8.task1;

import java.util.*;

public class Bank {

    // attributes
    LinkedHashSet<BankAccount> bankAccounts = new LinkedHashSet<BankAccount>();
    

    // constructors
    

    // methods
    public void addBankAccount(double balance, String name) {
        bankAccounts.add(new BankAccount(balance, name));
    }

    public void displayBankAccountBalances() {
        Iterator<BankAccount> iter = bankAccounts.iterator();
        double bankTotalBalance = 0.0;
        while (iter.hasNext()) {
            BankAccount currentAccount = iter.next();
            System.out.println(currentAccount.toString());
            bankTotalBalance += currentAccount.getBalance();
        }

        System.out.println("Total balance at Bank: " + bankTotalBalance);
        
    }

}
