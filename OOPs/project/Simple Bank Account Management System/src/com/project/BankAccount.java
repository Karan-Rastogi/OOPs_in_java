package com.project;

public class BankAccount {
    long accountNumber;
    String accountHolderName;
    long balance;

    public BankAccount(String accountHolderName, long accountNumber, long balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(long amount){
        balance += amount;
        System.out.println("Deposited: " + formatMoney(amount));
    }

    void withdraw(long amount){
        if (amount > balance){
            System.out.println("You have Insufficient Balance!");
            return;
        }

        balance -= amount;
        System.out.println("Withdraw: " + formatMoney(amount));
    }

    String formatMoney(long amount) {
        long dollar = amount / 100;
        long cent = amount % 100;
        return "$" + dollar + "." + String.format("%02d", cent);
    }

    void display(){
        System.out.println(
                "Account Number: " + accountNumber +
                "\nAccount Holder: " + accountHolderName +
                "\nBalance: " + formatMoney(balance));
    }
}
