package com.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.println("Enter account number: ");
        long accountNumber = sc.nextLong();

        System.out.println("Enter initial balance: ");
        long balance = sc.nextLong();

        BankAccount account= new BankAccount(name,accountNumber,balance);

        while(true){
            System.out.println("\n Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display balance");
            System.out.println("4. Exit");

            int choose = sc.nextInt();

            if(choose == 1){
                System.out.println("Enter amount: ");
                long amount = sc.nextLong();
                account.deposit(amount);
            } else if (choose == 2){
                System.out.println("Enter amount: ");
                long amount = sc.nextLong();
                account.withdraw(amount);
            } else if (choose == 3) {
                account.display();
            } else if (choose == 4) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Please choose right option");
            }
        }
        sc.close();
    }
}
