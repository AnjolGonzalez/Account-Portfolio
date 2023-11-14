package com.pluralsightfinance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Pam", "123", 12500);
        Valuable bankAccount2 = new BankAccount("Gary", "456", 1500);

        bankAccount.deposit(100);
        ((BankAccount) bankAccount2).deposit(100);

        System.out.println("Account 1 amount: $" + bankAccount.getBalance() +
                "\nAccount 2 amount: $" + ((BankAccount) bankAccount2).getBalance());
    }
}
