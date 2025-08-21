package seatWork;

import java.util.Scanner;
import java.util.ArrayList;

class accountCreation {
    private final ArrayList<mainBank> clientList = new ArrayList<>();
    private final Scanner sc;

    accountCreation(Scanner sc) {
        this.sc = sc;
    }

    void addClient(mainBank client){
        clientList.add(client);
    }

    void creating() {
        System.out.println("Creating Account...");
        while (true) {
            System.out.println("Are you sure you want to create an account? (yes/no)");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Account Creation Cancelled.");
                return;
            }

            mainBank client = new mainBank();

            while (true) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Are you sure of this name? (yes/no)");
                if (sc.nextLine().equalsIgnoreCase("yes")) {
                    client.setName(name);
                    break;
                } else {
                    System.out.println("Name not accepted. Try again.");
                }
            }

            while (true) {
                System.out.print("Enter account number: ");
                int accountNo = readInt();
                System.out.println("Are you sure of this account number? (yes/no)");
                if (sc.nextLine().equalsIgnoreCase("yes")) {
                    client.setAccountNo(accountNo);
                    break;
                } else {
                    System.out.println("Account number not accepted. Try again.");
                }
            }

            while (true) {
                System.out.print("Deposit initial balance: ");
                int balance = readInt();
                System.out.println("Are you sure of this balance? (yes/no)");
                if (sc.nextLine().equalsIgnoreCase("yes")) {
                    client.setBalance(balance);
                    break;
                } else {
                    System.out.println("Balance not accepted. Try again.");
                }
            }

            while (true) {
                System.out.print("Set the password(should be numbers): ");
                int password = readInt();
                System.out.println("Are you sure of this password? (yes/no)");
                if (sc.nextLine().equalsIgnoreCase("yes")) {
                    client.setPassword(password);
                    break;
                } else {
                    System.out.println("Password not accepted. Try again.");
                }
            }

            System.out.println("Are you sure to create this account? (yes/no)");
            String accept = sc.nextLine();
            if (accept.equalsIgnoreCase("yes")) {
                System.out.println("Did you know you can't change the details of your account after creation? \nDo you want to continue? (yes/no)");
                String accept2 = sc.nextLine();
                if (accept2.equalsIgnoreCase("yes")) {
                    addClient(client);
                    System.out.println("Congratulations! Your account has been created successfully.");
                    System.out.println("Your account details are: ");
                    System.out.println("Name: " + client.getName());
                    System.out.println("Account Number: " + client.getAccountNo());
                    System.out.println("Balance: " + client.getBalance() + "$");
                    System.out.println();
                    System.out.println("Do you want to create another account? (yes/no)");
                    String another = sc.nextLine();
                    if (!another.equalsIgnoreCase("yes")) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
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

    public ArrayList<mainBank> getClientList() {
        return clientList;
    }
}