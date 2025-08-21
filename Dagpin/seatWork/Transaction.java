package seatWork;

import java.util.Scanner;

class Transaction {
    private final accountCreation accounts;
    private final Scanner sc;

    public Transaction(accountCreation accounts, Scanner sc) {
        this.accounts = accounts;
        this.sc = sc;
    }

    public void transact() {
        System.out.print("Enter account number to transact: ");
        int accNo = readInt();

        mainBank client = findAccount(accNo);
        if (client == null) {
            System.out.println("Account not found.");
            return;
        }

        if (!authenticate(client)) {
            System.out.println("Recover Account? (yes/no)");
            String recover = sc.nextLine();
            if (recover.equalsIgnoreCase("yes")) {
                accountRecovery recovery = new accountRecovery(accounts, sc);
                recovery.start();
            } else {
                System.out.println("Exiting transaction.");
                return;
            }
        }

        System.out.println("WELCOME TO AAA BANK");
        while (true) {
            System.out.println("Choose transaction: 1) Deposit 2) Withdraw 3) Exit 4) Choose another account");
            int choice = readInt();

            if (choice == 1) {
                handleDeposit(client);
            } else if (choice == 2) {
                handleWithdraw(client);
            } else if (choice == 3) {
                System.out.println("Thank you for using our banking service.");
                break;
            } else if (choice == 4) {
                transact();
                return;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private boolean authenticate(mainBank client) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter password: ");
            int password = readInt();
            if (password == client.getPassword()) {
                return true;
            }
            System.out.println("Incorrect password. Attempts remaining: " + (2 - i));
        }
        System.out.println("Account locked. Please contact customer support.");
        return false;
    }

    private void handleDeposit(mainBank client) {
        while (true) {
            System.out.print("Enter deposit amount: ");
            int amount = readInt();
            client.setBalance(client.getBalance() + amount);
            System.out.println("Deposit successful. New balance: " + client.getBalance());
            System.out.print("Do you want to deposit more? (yes/no): ");
            if (!sc.nextLine().equalsIgnoreCase("yes")) break;
        }
    }

    private void handleWithdraw(mainBank client) {
        final int fee = 10;
        while (true) {
            System.out.print("Enter withdrawal amount: ");
            int amount = readInt();
            if (amount + fee > client.getBalance()) {
                System.out.println("Insufficient funds.");
            } else {
                client.setBalance(client.getBalance() - (amount + fee));
                System.out.println("Withdrawal successful. New balance: " + client.getBalance());
            }
            System.out.print("Do you want to withdraw more? (yes/no): ");
            if (!sc.nextLine().equalsIgnoreCase("yes")) break;
        }
    }

    private int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Enter a number: ");
            sc.next();
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    private mainBank findAccount(int accNo) {
        for (mainBank client : accounts.getClientList()) {
            if (client.getAccountNo() == accNo) {
                return client;
            }
        }
        return null;
    }
}