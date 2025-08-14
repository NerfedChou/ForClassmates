package seatWork;

import java.util.Scanner;

 class using {
     private Bank client;

     using(Bank client) {
            this.client = client;
     }

        void use() {
         Scanner input = new Scanner(System.in);

         while (true) {
             System.out.println("Do you want to Wirthdraw/Deposit/Exit");
             String choose = input.nextLine();

             if (choose.equalsIgnoreCase("withdraw")) {
                 System.out.println("Enter amount");
                 client.withdraw(input.nextInt());
                 input.nextLine();

             } else if (choose.equalsIgnoreCase("deposit")) {
                 System.out.println("Enter amount: ");
                 client.deposit(input.nextInt());
                 input.nextLine();
             } else if (choose.equalsIgnoreCase("exit")) {
                 break;
             } else {
                 System.out.println("Invalid Input");
             }
         }
     }
    }

