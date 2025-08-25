package seatWork;

import java.util.Scanner;

class accountRecovery {
    private accountCreation accounts;
    private Scanner scanner;

    accountRecovery(accountCreation accounts, Scanner scanner) {
        this.accounts = accounts;
        this.scanner = scanner;
    }

    // Gigamit ni Transaction
    accountRecovery(accountCreation accounts) {
        this(accounts, new Scanner(System.in));
    }

    // Interactive recovery flow
    void start() {
        System.out.print("Enter account number to recover: ");
        int accNo = readInt();
        mainBank clientAccount = findAccount(accNo);
        if (clientAccount == null) {
            System.out.println("Account not found.");
            return;
        }
        System.out.println("Please Verify with your name: ");
        String name = scanner.nextLine();
        if (!clientAccount.getName().equals(name)) {
            System.out.println("Name does not match. Recovery failed.");
            return;
        }

        System.out.print("Enter new password: ");
        int newPassword = readInt();

        clientAccount.setPassword(newPassword);
        System.out.println("Password updated successfully for account number: " + accNo);
    }

    mainBank recoverAccount(int accNo, int newPassword) {
        mainBank client = findAccount(accNo);
        if (client != null) {
            client.setPassword(newPassword);
        }
        return client;
    }

    private mainBank findAccount(int accNo) {
        for (mainBank client : accounts.getClientList()) {
            if (client.getAccountNo() == accNo) {
                return client;
            }
        }
        return null;
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Enter a number: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}