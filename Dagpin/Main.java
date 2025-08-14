import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Transact client = new Transact();

        System.out.println("Name: ");
        client.setName(sc.nextLine());
        System.out.println("Account Number: ");
        client.setAccountNo(sc.nextInt());
        sc.nextLine();
        System.out.println("Balance: ");
        client.setBalance(sc.nextInt());

        System.out.println("Initial Name: " + client.getName() + "\n" + " Initial Account Number: " + client.getAccountNo() +"\n" + "Initial Balance: " + client.getBalance());

        System.out.println("Account Created Succecsfully.");

    }
}
