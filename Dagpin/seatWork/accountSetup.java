package seatWork;

import java.util.Scanner;

public class accountSetup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank client = new Bank();

        while (true) {
            System.out.println("Welocome to AA bank.");
            System.out.println("Enter Name: ");
            client.setName(sc.nextLine());

            System.out.println("Enter Account Number: ");
            client.setAccountNo(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter Initial Balance: ");
            client.setBalance(sc.nextInt());
            sc.nextLine();

            System.out.println("Account Created Successfully.");

            System.out.println("Do you want to perform another transaction? (yes/no)");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Final Account Details:");
        System.out.println("Name: " + client.getName());
        System.out.println("Account Number: " + client.getAccountNo());
        System.out.println("Balance: " + client.getBalance() + "$");
        System.out.println("Thank you for using our banking system!");
        System.out.println();
        System.out.println("Wait for a while you will be redirected to the main page.");
        using user = new using(client);
        while (true) {
            user.use();
            System.out.println("Do you want another transaction? (yes/no)");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }
    sc.close();
    }
}
