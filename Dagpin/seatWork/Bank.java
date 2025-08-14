package seatWork;

import java.util.Scanner;

class Bank {
    private String name;
    private int accountNo;
    private int balance;
    Scanner sc = new Scanner(System.in);

    void setName(String name) {
        this.name = name;
        System.out.println("Do you want to change the name? (yes/no)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter new name: ");
            this.name = sc.nextLine();
        } else {
            System.out.println("Name: " + this.name);
        }
    }

    void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
        System.out.println("Do you want to change the account number? (yes/no)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter new account number: ");
            this.accountNo = sc.nextInt();
            sc.nextLine(); // Consume newline
        } else {
            System.out.println("Account number remains unchanged: " + this.accountNo);
        }
    }
    void setBalance(int balance) {
        this.balance = balance;
    }
    String getName() {
        return name;
    }
    int getAccountNo() {
        return accountNo;
    }
    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be above 0.");
        }
    }
    void withdraw(int amount) {
        int transactionFee = 10;
        if (amount + transactionFee <= this.balance) {
            this.balance -= amount + transactionFee;
            System.out.println("Withdrawal successful. Transaction fee of " + transactionFee + " applied. Current balance: " + getBalance() + " $.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}