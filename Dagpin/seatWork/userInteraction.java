package seatWork;

import java.util.Scanner;

public class userInteraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        accountCreation accounts = new accountCreation(scanner);
        accounts.creating();
        Transaction transaction = new Transaction(accounts, scanner);
        transaction.transact();
    }
}